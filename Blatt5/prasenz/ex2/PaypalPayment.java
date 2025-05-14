package Blatt5.prasenz.ex2;

public class PaypalPayment implements PaymentProvider {

    @Override
    public void pay(double amount) {
        // Implement the payment logic here
        System.out.println("Paying " + amount + " using PayPal");
    }
}
