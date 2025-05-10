import Blatt5.ex1.Customer;
import Blatt5.ex1.Profile;
import Blatt5.ex1.ShippingInfo;
import Blatt5.ex2.InvalidCustomerException;
import Blatt5.ex2.InvalidShippingInfoException;
import Blatt5.ex2.MissingShippingInfoException;

public class main {
    public static void main(String[] args) throws InvalidShippingInfoException, MissingShippingInfoException, InvalidCustomerException {
        ShippingInfo info =
                new ShippingInfo (" Munich", 80331 , "Germany ");
        Profile profile = new Profile(info );
        Customer customer = new Customer(profile , 123);
        System.out.println(" Shipping to: " + customer.getProfile().getShippingInfo().getCity());
    }
}
