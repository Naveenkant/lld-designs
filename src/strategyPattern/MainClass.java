package strategyPattern;

public class MainClass {
    public static void main(String[] args) {
        Payment payment = new Payment(new CreditCard("John Doe", "1234567890123456", "786", "12/23"));
        ShoppingCart cart = new ShoppingCart(payment);

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCard("John Doe", "1234567890123456", "786", "12/23"));
        cart.checkout(100);

        // Pay using PayPal
        cart.setPaymentStrategy(new PaypalPayment("myemail@example.com", "mypassword"));
        cart.checkout(200);

        // Pay using Google Pay
        cart.setPaymentStrategy(new Upi("1234567890", "1234"));
        cart.checkout(300);
    }
}
