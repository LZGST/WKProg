package Blatt5.ex2;

public class InvalidShippingInfoException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidShippingInfoException(String message) {
        super(message);
    }

    public InvalidShippingInfoException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidShippingInfoException(Throwable cause) {
        super(cause);
    }

}
