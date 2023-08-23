package Confilm.Example;

public class Account {

    private String number;
    private String Holder;

    public Account() {
    }

    public Account(String number, String holder, int balance) {
        this.number = number;
        Holder = holder;
        Balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String holder) {
        Holder = holder;
    }



    private int Balance;
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1_000_000;

    public int getBalance() {
        return Balance;
    }
    public void setBalance(int balance) {
        if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
            System.out.println("잘못된 입력입니다. 현재 balance 값이 유지됩니다. ");
        } else {
            this.Balance = balance;
        }
    }
    int balance;
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
}
