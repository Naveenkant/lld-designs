package LLDs.zomato.observer;

import LLDs.zomato.order.Order;

public interface Observer {
    void update(Order orderDetails);
}
