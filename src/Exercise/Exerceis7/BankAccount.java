package Exercise.Exerceis7;

public class BankAccount {

    protected int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(int amount, BankAccount bankCount) {
        if (withdraw(amount)) {
            bankCount.deposit(amount);
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("%,d원", getBalance());
    }
}