package zomato.payment;

public class Payment {
        private PaymentStrategy paymentStrategy;

        public Payment(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void pay(int amount) {
            paymentStrategy.pay(amount);
        }
    }
