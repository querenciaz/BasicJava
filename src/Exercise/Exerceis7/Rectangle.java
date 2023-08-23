package Exercise.Exerceis7;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width * height) * 2;
    }

    public String toString() {
        return "도형의 종류: 사각형의 perimeter: " + perimeter() + "cm " + " 사각형의 area " + area() + "cm";
    }
}
