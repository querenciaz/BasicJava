package Chapter06;

public class Car {
    // 필드선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 선언
    public Car() {
        this(null, null, 0);
    } // 생성자 1

    Car(String model) {  // 생성자 2
        this(model, null, 0);
    }

    Car(String model, String color) {      // 생성자 3
        this(model, color, 0);
    }

    Car(String model, String color, int maxSpeed) {    // 생성자 4
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}