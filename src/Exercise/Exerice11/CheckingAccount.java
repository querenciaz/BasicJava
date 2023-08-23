package Exercise.Exerice11;

import Exercise.Exercise8.BankAccount;

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
            if (protectedBy != null) {
                protectedBy.withdraw(amount - balance);
                balance = 0;
            } else {
                return false; // 잔고보다 출금액이 크고 보호 계좌도 없는 경우, 출금 실패
            }
        } else {
            balance -= amount;
            return true; // 출금 성공
        }
        return false;
    }

    @Override
//    public boolean withdraw(int amount) {
//        if (amount > balance) {
//            protectedBy.withdraw(amount - balance);
//            balance = 0;
//        } else {
//            withdraw(amount);
//            return true;
//        }
//        return false;
//    }

    public String getAccountType() {
        return "당좌예금";
    }
}
