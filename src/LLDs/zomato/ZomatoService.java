package LLDs.zomato;

import LLDs.zomato.deliveryPartner.Partner;
import LLDs.zomato.deliveryPartner.PartnerStatus;
import LLDs.zomato.observer.OrderData;
import LLDs.zomato.order.Order;
import LLDs.zomato.order.OrderItem;
import LLDs.zomato.order.OrderStatus;

import java.util.*;

public class ZomatoService {
    private static ZomatoService instance;
    private  Map<String, User> users;
    private  Map<String, Restaurant> restaurants;
    private  Map<String, Order> orders;
    private  Map<String, Partner> deliveryAgents;
    OrderData orderData;

    private ZomatoService() {
        users = new HashMap<>();
        restaurants = new HashMap<>();
        orders = new HashMap<>();
        deliveryAgents = new HashMap<>();
        orderData = new OrderData();
    }
    public static synchronized ZomatoService getInstance() {
        if (instance == null) {
            instance = new ZomatoService();
        }
        return instance;
    }
    public void registerCustomer(User user) {
        users.put(user.getName(), user);
        orderData.registerObserver(user);
    }

    public void registerRestaurant(Restaurant restaurant) {
        restaurants.put(restaurant.getId(), restaurant);
        orderData.registerObserver(restaurant);

    }

    public void registerDeliveryAgent(Partner agent) {
        deliveryAgents.put(agent.getName(), agent);
        orderData.registerObserver(agent);

    }

    public List<Restaurant> getAvailableRestaurants() {
        return new ArrayList<>(restaurants.values());
    }
    public Order placeOrder(String customerId, String restaurantId, List<OrderItem> items) {
        User user = users.get(customerId);
        Restaurant restaurant = restaurants.get(restaurantId);
        if (user != null && restaurant != null) {
            Order order = new Order(generateOrderId(), restaurant,user);
            for (OrderItem item : items) {
                order.addOrderItem(item);
            }
            orders.put(order.getOrderId(), order);
            orderData.orderNotification(order);
            System.out.println("Order placed: " + order.getOrderId());
            return order;
        }
        return null;
    }
    public void cancelOrder(String orderId) {
        Order order = orders.get(orderId);
        if (order != null && order.getStatus() == OrderStatus.PENDING) {
            order.setStatus(OrderStatus.CANCELED);
            orderData.orderNotification(order);
            System.out.println("Order cancelled: " + order.getOrderId());
        }
    }

    private String generateOrderId() {
        // Generate a unique order ID using UUID
        return "ORD" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public void updateOrderStatus(String orderId, OrderStatus status) {
        Order order = orders.get(orderId);
        if (order != null) {
            order.setStatus(status);
            orderData.orderNotification(order);// we can add eventType in observer so that we can selective notify restaurant/user/partner
            if (status == OrderStatus.PLACED) {
                assignDeliveryAgent(order);
            }
        }
    }
    private void assignDeliveryAgent(Order order) {
        for (Partner agent : deliveryAgents.values()) {
            if (agent.getPartnerStatus()== PartnerStatus.AVAILABLE) {
                agent.setPartnerStatus(PartnerStatus.BUSY);
                order.assignDeliveryAgent(agent);
                orderData.orderNotification(order);// we can add eventType in observer so that we can selective notify restaurant/user/partner
                break;
            }
        }
    }
    //updateOrderstatus

}
