package practice;

import java.util.Scanner;

public class Practice21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;

        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("-------------------------------------");
            System.out.print("선택 -> ");

            String number = scanner.nextLine();
            int money = 0;

            if (number.equals("1")) {
                System.out.print("예금 -> ");
                money = Integer.parseInt(scanner.nextLine());
                balance += money;
            } else if (number.equals("2")) {
                System.out.print("출금 -> ");
                money = Integer.parseInt(scanner.nextLine());
                balance -= money;
            } else if (number.equals("3")) {
                System.out.print("잔고 -> " + balance + "\n");
                balance = money;
            } else if (number.equals("4")) {
                System.out.print("프로그램 종료 ");
                run = false;
            }
        }
    }
}