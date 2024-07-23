package MachineCodingRound.meesho.services;

import MachineCodingRound.meesho.dto.Order;

public interface OrderServiceI {
    public String addOrder(Order order);
    public Order getOrder(String orderId);
}
