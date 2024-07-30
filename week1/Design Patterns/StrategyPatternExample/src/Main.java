public class Main {
    public static void main(String[] args) {
        PaymentContext pc = new PaymentContext();
        pc.setPaymentStrategy(new PayPalPayment());
        pc.executePayment();
        pc.setPaymentStrategy(new CreditCardPayment());
        pc.executePayment();
    }
}