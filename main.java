import Blatt5.prasenz.ex2.CheckoutService;
import Blatt5.prasenz.ex2.CreditCardPayment;

public class main {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new CreditCardPayment());
    }
}
