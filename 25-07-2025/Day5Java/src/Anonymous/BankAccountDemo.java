package Anonymous;

public class BankAccountDemo {

    interface BankOps {
        void deposit(double amount);
    }

    public static void main(String[] args) {

        BankOps savingsAccount = new BankOps() {
            double balance = 1000;
            public void deposit(double amount) {
                balance += amount;
                System.out.println("Savings Account: Deposited ₹" + amount + ". New Balance: ₹" + balance);
            }
        };

        BankOps currentAccount = new BankOps() {
            double balance = 5000;

            public void deposit(double amount) {
                balance += amount;
                System.out.println("Current Account: Deposited ₹" + amount + ". New Balance: ₹" + balance);
            }
        };

        savingsAccount.deposit(1500);
        currentAccount.deposit(2500);
    }
}
