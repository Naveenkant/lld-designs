package zomato.observer;
import zomato.order.Order;

import java.util.*;
public class OrderData implements Subject {
    List<Observer> observers ;
    Order orderDetails;
    public OrderData() {
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(orderDetails);
        }

    }
    public void orderNotification(Order orderDetails) {
        this.orderDetails = orderDetails;
        notifyObservers();
    }
//    public void orderPlaced(String orderDetails) {
//        this.orderDetails = orderDetails;
//        notifyObservers(OrderEventType.ORDER_PLACED, orderDetails);
//    }
//
//    public void orderCanceled(String orderDetails) {
//        this.orderDetails = orderDetails;
//        notifyObservers(OrderEventType.ORDER_CANCELED, orderDetails);
//    }
//
//    public void partnerAssigned(String orderDetails) {
//        this.orderDetails = orderDetails;
//        notifyObservers(OrderEventType.PARTNER_ASSIGNED, orderDetails);
//    }
}
