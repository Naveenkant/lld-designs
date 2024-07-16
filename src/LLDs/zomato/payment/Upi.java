package LLDs.zomato.payment;

public class Upi implements PaymentStrategy {
    private String upiId;
    private String pin;

    public Upi(String upiId, String pin) {
        this.upiId = upiId;
        this.pin = pin;
    }
    @Override
    public void pay(int amount) {
        System.out.println("pay upi " + upiId + " to " + pin);
    }
}