package DesignPatterns.strategyPattern;

public class CreditCard implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
    @Override
    public void pay(int amount) {
        System.out.println("You have paid " + amount + " credit card");
    }
}
