package gamma;

public class Main{
    public static void main(String[] args) {
        sp pay = new sp();

        pay.setPaymentStrategy(new payPal());

        pay.setPaymentStrategy(new Square());

        pay.setPaymentStrategy(new Stripe());

    }
}