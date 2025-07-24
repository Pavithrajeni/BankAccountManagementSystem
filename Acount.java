public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;

    public Account(int accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " successfully.");
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn ₹" + amount + " successfully.");
    }

    public void transfer(Account toAccount, double amount) throws Exception {
        this.withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Transferred ₹" + amount + " to Account No: " + toAccount.getAccountNumber());
    }

    public void showDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + holderName + ", Balance: ₹" + balance);
    }
}
