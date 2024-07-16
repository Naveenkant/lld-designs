package DesignPatterns.strategyPattern;

public class ShoppingCart {
    private Payment payment;

    public ShoppingCart(Payment payment) {
        this.payment = payment;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        payment.setPaymentStrategy(paymentStrategy);
    }

    public void checkout(int amount) {
        payment.pay(amount);
    }
}
