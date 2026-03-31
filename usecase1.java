class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.02; 
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        double interest = balance * 0.04;

        if (balance > 50000) {
            interest += 500;
        }

        return interest;
    }
}

class FixedDeposit extends SavingsAccount {

    public FixedDeposit(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        double interest = super.calculateInterest();
        interest += balance * 0.02;
        return interest;
    }
}

public class CS1 {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(6700);
        System.out.println("TC1 Output: " + acc1.calculateInterest()); 

        Account acc2 = new SavingsAccount(10000);
        System.out.println("TC2 Output: " + acc2.calculateInterest()); 

        Account acc3 = new FixedDeposit(45999);
        System.out.println("TC3 Output: " + acc3.calculateInterest()); 
    }
}
