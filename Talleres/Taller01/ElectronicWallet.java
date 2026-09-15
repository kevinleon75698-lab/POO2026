public class ElectronicWallet {
    private static final double MAX_PAYMENT = 500000.0;
 
    private final String owner;
    private double balance;
 
    public ElectronicWallet(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }
 
    public String getOwner() {
        return owner;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public boolean topUp(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
 
    public boolean pay(double amount) {
        if (amount > 0 && amount <= balance && amount <= MAX_PAYMENT) {
            balance -= amount;
            return true;
        }
        return false;
    }
}