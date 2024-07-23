package MachineCodingRound.meesho.dto;

public class Payment {
    private String paymentId;
    private String paymentType;
    private double amount;
    public Payment(String paymentId, String paymentType, double amount) {
        this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
