package MachineCodingRound.meesho.dto;

import MachineCodingRound.meesho.enums.OrderStatus;
import MachineCodingRound.meesho.enums.PaymentStatus;

public class Order {
    private String orderId;
    private String userId;
    private String productId;
    private int quantity;
    private OrderStatus orderStatus;
    private Payment payment;

    public Order(String orderId, String userId, String productId, int quantity, OrderStatus orderStatus, Payment payment) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.orderStatus = orderStatus;
        this.payment = payment;

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
