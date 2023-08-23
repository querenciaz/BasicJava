package Exercise.Exerceis7;

public class Triangle extends Shape{

    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    public double area() {
        return Math.sqrt(3) * side * side / 4;
    }
    public double perimeter () {
        return side * 3;
    }

    public String toString() {
        return "도형의 종류: 삼각형의 perimeter: " + perimeter() + "cm " + " 삼각형의 area " + area() + "cm";
    }
}
