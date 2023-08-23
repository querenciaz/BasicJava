package Exercise.Exercise8;


public class Triangle extends Shape {

    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    public double area() {
        return Math.sqrt(3) * side * side / 4;
    }

    public double perimeter() {
        return side * 3;
    }

    public String toString() {
        return String.format("도형의 종류: 정삼각형, 둘레 : %.2f㎝, 넓이 : %.2f㎠",  perimeter(), area());
    }
}
