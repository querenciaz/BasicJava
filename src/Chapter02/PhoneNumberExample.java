package Chapter02;

import java.util.Scanner;

public class PhoneNumberExample {
    public static void main(String[] args) {
        /*
        전화번호를 세부분으로 나누어 입력받고
        010-1234-5678로 출력하는 코드를 작성하시오.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("전화번호 첫번쨰 자리:");
        String firstNumber = scanner.next();
        System.out.print("전화번호 두번쨰 자리:");
        String secondNumber = scanner.next();
        System.out.print("전화번호 세번째 자리:");
        String thirdNumber = scanner.next();

        //System.out.printf("전화번호는:" + firstNumber + "-" + secondNumber + "-" + thirdNumber);
        System.out.printf("%s-%s-%s", firstNumber, secondNumber, thirdNumber);
        // &s 문자열(String), %d 정수(integer),  %f 실수(float)
    }
}