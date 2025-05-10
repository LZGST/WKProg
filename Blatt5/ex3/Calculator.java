package Blatt5.ex3;

public class Calculator {
    public static double divide(double a, double b){
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return Double.NaN; // Return NaN to indicate an error
        }
    }
    public static void main(String [] args ) throws ArithmeticException {
        System.out.println(Calculator.divide(3, 0));
    }
}
