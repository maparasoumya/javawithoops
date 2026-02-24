class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) throws DivideByZeroException {
        if (denominator == 0) {
            throw new DivideByZeroException("Cannot divide by zero.");
        }
        return numerator / denominator;
    }
}
