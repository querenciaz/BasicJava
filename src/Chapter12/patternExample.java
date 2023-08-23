package Chapter12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class patternExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("휴대전화번호를 입력하세요: ");
        String inputStr = scanner.nextLine();

        // 저귱 표현식
        String regExp = "010-[0-9]{3,4}-[0-9]{4}";
        // Pattern 클래스
        boolean matches = Pattern.matches(regExp, inputStr);
        boolean matches1 = inputStr.matches(regExp);
        // Pattern.matches 과 inputStr.matches 같은표현식
        if (matches1) {
            System.out.println("올바른 휴대 전화번호가 입력되었습니다.");
        } else {
            System.err.println("올바른 휴대 전화번호를 입력해주세요.");
        }
        scanner.close();

        System.out.println("<<a href ='https://nextit.or.kr/a' class='a'>내용1</a>");
        System.out.println("<<a href ='https://nextit.or.kr/b' class='b'>내용2</a>");
        System.out.println("<<a href ='https://nextit.or.kr/c' class='c'>내용3</a>");
        System.out.println("<<a href ='https://nextit.or.kr/d' class='d'>내용4</a>");
        System.out.println("<<a href ='https://nextit.or.kr/e' class='e'>내용5</a>");
        System.out.println("<<a href ='https://nextit.or.kr/f' class='f'>내용6</a>");
        System.out.println("<<a href ='https://nextit.or.kr/g' class='g'>내용7</a>");
        System.out.println("<<a href ='https://nextit.or.kr/h' class='h'>내용8</a>");
        System.out.println("<<a href ='https://nextit.or.kr/i' class='i'>내용9</a>");
        System.out.println("<<a href ='https://nextit.or.kr/j' class='j'>내용10</a>");
    }
}
