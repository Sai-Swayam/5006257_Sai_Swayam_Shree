class Gpay {
    public void gpayPayment() {
        System.out.println("GooglePay transaction successful.");
    }
}

class PhonePe {
    public void phonePePayment() {
        System.out.println("Payment successful! Thanks for using PhonePe");
    }
}


class GpayAdapter implements PaymentProcessor {
    private Gpay gp;

    public GpayAdapter() {
        this.gp = new Gpay();
    }

    @Override
    public void processPayment() {
        gp.gpayPayment();
    }
}

class PhonePeAdapter implements PaymentProcessor {
    private PhonePe pp;

    public PhonePeAdapter() {
        this.pp = new PhonePe();
    }

    @Override
    public void processPayment() {
        pp.phonePePayment();
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor gpay = new GpayAdapter();
        PaymentProcessor ppay = new PhonePeAdapter();

        gpay.processPayment();
        ppay.processPayment();
    }
}