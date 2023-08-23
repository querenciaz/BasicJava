package Exercise.Exerceis7;
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
        return "도형의 종류: 원의 perimeter: " + perimeter() + "cm " + " 원의 area " + area() + "cm";
    }
}
