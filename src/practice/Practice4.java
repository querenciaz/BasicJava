package practice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        /*
        사용자로부터 500원, 100원, 50원, 10원짜리 동전의 갯수를 입력 받아
        저금통 안에 총 얼마가 들어 있는지 출력하는 프로그램을 만들어보자.
         */
        Scanner scanner = new Scanner(System.in);
        int Coin500, Coin100, Coin50, Coin10, result;
        System.out.print("Coin500 동전의 갯수:");
        Coin500 = scanner.nextInt();
        System.out.print("Coin100 동전의 갯수:");
        Coin100 = scanner.nextInt();
        System.out.print("Coin50 동전의 갯수:");
        Coin50 = scanner.nextInt();
        System.out.print("coin10 동전의 갯수:");
        Coin10 = scanner.nextInt();
        result = (Coin500 * 500) + (Coin100 * 100) + (Coin50 * 50) + (Coin10 * 10);

        System.out.println("저금통 안에 동전의 액수는 " + result + "원");
    }
}
