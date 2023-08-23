package practice;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름, 주소, 나이, 신장을 빈칸으로 분리하여 순서대로 입력하시오. ");

        String name = scanner.next();
        String add = scanner.next();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();

        System.out.println("===============");
        System.out.println("저의 이름은 " + name + "입니다. ");
        System.out.println("저의 주소는 " + add + "입니다. ");
        System.out.println("저의 나이는 " + age + "입니다. ");
        System.out.println("저의 신장은 " + weight + "입니다. ");
    }
}
