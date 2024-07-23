package MachineCodingRound.meesho.respository;

import MachineCodingRound.meesho.dto.Order;

import java.util.HashMap;

public class OrderRepository {
    HashMap<String, Order> orders;

    public OrderRepository(){
        orders = new HashMap<>();
    }

    public Order createOrder(Order order){
        if(orders.get(order.getOrderId())!=null){
            throw new RuntimeException("Order creation failed");
        }
        orders.put(order.getOrderId(), order);
        return order;
    }

    public Order getOrder(String orderId){
        return orders.get(orderId);
    }
}
