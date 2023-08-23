package Exercise.Exerceis7;

public class SavingAccount extends BankAccount{

    private double interestRate;

    public SavingAccount(int balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void updateBalance(int period) {
        this.balance += balance * interestRate * period;
    }
}
