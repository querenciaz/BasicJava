package practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /*
        실수 자료형을 이용하여 직사각형의 둘레와 면적을 구하는 프로그램을 만들어보자.
        실수 * 형 변수 width(가로), height(세로), area(넓이), perimeter(둘레)를 선언하고,
        클래스를 이용하여 사용자로부터 직사각형의 가로, 세로 길이를 입력받아 다음과 같이 넓이와 둘레를 출력
         */
        Scanner scanner = new Scanner(System.in);
        double width, height, area, perimeter;
        System.out.print("가로의 길이는?(단위:cm):");
        width = scanner.nextDouble();
        System.out.print("세로의 길이는?(단위:cm):");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("직사각형의 넓이는" + area);
        perimeter = 2 * (width + height);
        System.out.println("직사각형의 둘레는" + perimeter);

    }
}
