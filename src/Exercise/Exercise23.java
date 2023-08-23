package Exercise;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        /*
        원기둥의 밑변의 반지름과 높이를 입력 받아서 밑변의 넓이와 부피를 계산하는 프로그램을 작성하여보자.
        원주율은 Math.PI를 사용한다
         */

        //입력
        Scanner scanner = new Scanner(System.in);
        double radius, height, area, lattice;
        System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
        radius = scanner.nextDouble();
        System.out.print("원기둥 높이를 입력하시오.(단위: cm): ");
        height = scanner.nextDouble();
        //처리
        area = radius * radius;
        lattice = area * height * Math.PI;
        //출력
        System.out.println("원기둥 밑변의 넓이는" + area +"cm^2이고, 원기둥의 부피는" + lattice + "cm^3이다. ");
    }
}
