package Exercise.Exercise6;

public class Car {

    private double speed;
    private String color;
    private static final double MAX_SPEED = 200.0;

    public Car() {
    }
    public Car(String color) {
        this.color = color;
    }


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean speedUp(double speed) {
        if (speed + this.speed < 0 || speed + this.speed > MAX_SPEED) {
            return false;
        }
        // if (speed > 0 && speed < MAX_SPEED) {
        // this.speed += speed;
        // return falser;
        this.speed += speed;
        return true;
    }

    public static double getMaxSpeed() {
        return MAX_SPEED;
    }
    // 객체(인스턴스)가 가지고있는 필드의 데이터를 확인하기 위한 용도
    public String toString() {
        return String.format(color);
    }
}