package Exercise.Exercise6;

public class Circle {

    private double radius;
    private double x;
    private double y;
    double area;
    public Circle() {}
    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}