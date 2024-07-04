package zomato.order;

import zomato.Restaurant;
import zomato.User;
import zomato.deliveryPartner.Partner;

import java.util.*;

public class Order {
           String  orderId;
           Restaurant restaurant;
           List<OrderItem> orderItems;
           User user;
           OrderStatus status;
           Partner deliveryAgent;

           public Order(String orderId,  Restaurant restaurant, User user) {
               this.orderId = orderId;
               this.restaurant = restaurant;
               this.user = user;
               this.orderItems = new ArrayList<>();
               status=OrderStatus.PENDING;
           }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.addAll(orderItems);
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void assignDeliveryAgent(Partner deliveryAgent) {
        this.deliveryAgent=deliveryAgent;
    }
}
