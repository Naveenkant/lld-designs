package zomato.observer;

import zomato.order.Order;

public interface Observer {
    void update(Order orderDetails);
}
