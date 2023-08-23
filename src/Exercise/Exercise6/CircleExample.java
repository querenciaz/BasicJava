package Exercise.Exercise6;

public class CircleExample {
    public static void main(String[] args) {

        // 자바빈즈 패턴 사용 한번 읽어보기
        Circle circle = new Circle();
        circle.setRadius(3.6);
        circle.setX(0.0);
        circle.setY(1.5);

        System.out.println("반지름: " + circle.getRadius());
        System.out.println("중심 좌표: " + "(" + circle.getX() + "," + circle.getY() + ")");
        System.out.printf("넓이: %.2f\n", circle.getArea());

        Circle circle2 = new Circle();
        circle2.setRadius(-5.0);  //  만약 잘못된 값이 입력되었을 경우 반지름의 값을 0으로 한다.
        circle2.setX(1.0);
        circle2.setY(2.2);

        System.out.println("반지름: " + circle2.getRadius());
        System.out.println("중심 좌표: " + "(" + circle2.getX() + "," + circle2.getY() + ")");
        System.out.printf("넓이: %.2f\n", circle2.getArea());

    }
}
