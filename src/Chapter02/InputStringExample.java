package Chapter02;

import java.util.Scanner;

public class InputStringExample {
    public static void main(String[] args) {
        /*
        콘솔에 결과 출력
        이름: 홍길동
        나이:25
        전화:010-1234-5678
         */
        // 입력부분
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요:"); // print는 출력만하는 명령어
        String name = scanner.next(); // scanner 붙으면 : 커서가 깜빡거림(입력)
        System.out.print("나이를 입력하세요:");
        String age = scanner.next();// 나이를 문자 또는 숫자로 받을지 선택 해줘야함
        // next 문자열 입력 공백이전까지만 입력, nextDouble 실수입력받음
        System.out.print("전화번호를 입력하세요:");
        String phonenumber = scanner.next();
        // 출력부분
        System.out.printf("이름:" + name);
        System.out.printf("나이:" + age +"\n");
        System.out.printf("전화번호: %s", phonenumber );
        // printf 커서가 문장 바로옆에 생김, println 커서가 문장 밑에 생김
    }
}
