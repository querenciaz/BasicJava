package Exercise.Exerceis7;

public class CheckingAccount extends BankAccount {

    private SavingAccount protectedBy;

    public CheckingAccount(int balance) {
        super(balance);
        this.balance = balance;
    }

    public CheckingAccount(int balance, SavingAccount protectedBy) {
        super(balance);
        this.protectedBy = protectedBy;
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount > balance) {
            protectedBy.withdraw(amount - balance);
            balance = 0;
        } else {
            withdraw(amount);
            return true;
        }
        return false;
    }
}