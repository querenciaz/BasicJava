package Exercise.Exercise8;


public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return radius * 2 * Math.PI;
    }

    public String toString() {
        return String.format("도형의 종류: 원, 둘레 : %.2f㎝, 넓이 : %.2f㎠", perimeter(), area());
    }
}