abstract class Payment {
    private double amount;
    private int transactionId;
    private String method;

    public Payment(double amount, String method, int transactionId) {
        this.amount = amount;
        this.method = method;
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public int getTransactionId() {
        return transactionId;
    }

    abstract void processPayment();
}
class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber, int transactionId) {
        super(amount, "Credit Card", transactionId);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        double fee = getAmount() * 0.02;
        double total = getAmount() + fee;
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println("Amount: " + getAmount());
        System.out.println("Convenience Fee (2%): " + fee);
        System.out.println("Total Charged: " + total);
    }
}

class UpiPayment extends Payment {
    private String upiId;

    public UpiPayment(double amount, String upiId, int transactionId) {
        super(amount, "UPI", transactionId);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        if (upiId != null && upiId.contains("@")) {
            System.out.println("Processing UPI Payment...");
            System.out.println("Transaction ID: " + getTransactionId());
            System.out.println("Amount: " + getAmount());
            System.out.println("UPI ID Verified: " + upiId);
        } else {
            System.out.println("Invalid UPI ID!");
        }
    }
}

class PaymentProcessor {
    public void makePayment(Payment payment) {
        payment.processPayment();
    }
}

public class cs3 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(1000, "1234-5678-9012", 101);
        Payment p2 = new UpiPayment(500, "user@upi", 102);

        PaymentProcessor processor = new PaymentProcessor();

        processor.makePayment(p1); // Polymorphism
        processor.makePayment(p2); // Polymorphism
    }
}
