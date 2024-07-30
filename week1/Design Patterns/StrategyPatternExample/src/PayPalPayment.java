public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("PayPal payment initiated");
    }
}
