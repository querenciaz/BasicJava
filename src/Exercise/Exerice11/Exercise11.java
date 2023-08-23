package Exercise.Exerice11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("어떤 수를 나누시겠습니까?>> ");
                int numberOne = Integer.parseInt(scanner.nextLine());
                System.out.print("어떤 수를 나누시겠습니까?>> ");
                int numberTwo = Integer.parseInt(scanner.nextLine());
                int result = numberOne / numberTwo;
                System.out.print(numberOne + "/" + numberTwo + " = " + result);
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요. ");
            }
        }
        scanner.close();
    }
}