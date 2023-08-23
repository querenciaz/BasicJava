package Exercise;

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {

        /*
        사용자로부터 5과목의 점수를 입력받아 평균을 구하는 프로그램을 작성하여 보자.
        평균 점수로 학점을 계산하여 출력한다.(평균 점수는 소숫점 둘째자리까지만 출력)

        평균 점수가 90점 이상이면 A, 80점 이상 90점 미만이면 B, 70점 이상 80점 미만이면 C, 60점 이상 70점 미만이면 D, 60점 미만이면 F로 계산한다.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하시오. \n");
        System.out.println();

        System.out.print("프로그래밍 기초: ");
        int one = scanner.nextInt();
        System.out.print("데이터베이스: ");
        int two = scanner.nextInt();
        System.out.print("화면 구현: ");
        int three = scanner.nextInt();
        System.out.print("애플리케이션 구현: ");
        int four = scanner.nextInt();
        System.out.print("머신 러닝: ");
        int five = scanner.nextInt();

        int result = one + two + three + four + five;
        System.out.print("총점 " + result + "\n");
        double average = (one + two + three + four + five) / 5.0;
        System.out.print("평균 " + average + "\n");

        double score = average;

        if (score >= 90) {
            System.out.println("학점: A ");
        } else if (score >= 80) {
            System.out.println("학점: B ");
        } else if (score >= 70) {
            System.out.println("학점: C ");
        } else if (score >= 60) {
            System.out.println("학점: D ");
        } else {
            System.out.println("학점: F ");
        }
    }
}