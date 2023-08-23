package Chapter02;

import java.util.Scanner;

public class InputSumExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번쨰 수:");
        int fritsNumber = scanner.nextInt();
        System.out.print("두번째 수:");
        int secondNumber = scanner.nextInt();

        int result = fritsNumber + secondNumber; // int result는 정수에 100을 넣겠다.
        System.out.println("덧셈 결과:" + result);
    }
}
