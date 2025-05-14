package Blatt5.prasenz.ex2;

public class CheckoutService {
    private PaymentProvider provider;

    public CheckoutService(PaymentProvider paymentProvider) {
        this.provider = paymentProvider;
    }

    public void processPayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        provider.pay(amount);
    }
}
