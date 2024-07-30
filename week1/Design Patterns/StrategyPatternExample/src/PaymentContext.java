public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy ps) {
        this.paymentStrategy = ps;
    }

    public void executePayment() {
        paymentStrategy.pay();
    }
}
