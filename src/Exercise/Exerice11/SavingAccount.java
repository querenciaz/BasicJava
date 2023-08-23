package Exercise.Exerice11;

import Exercise.Exercise8.BankAccount;

public class SavingAccount extends BankAccount {

    private double interestRate;

    public SavingAccount(int balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public String getAccountType() {
        return "저축예금";
    }

    public void updateBalance(int period) {
        this.balance += balance * interestRate * period;
    }
}
