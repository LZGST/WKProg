package Blatt5.ex2;

public class InvalidCustomerException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidCustomerException(String message) {
        super(message);
    }

    public InvalidCustomerException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCustomerException(Throwable cause) {
        super(cause);
    }
}
