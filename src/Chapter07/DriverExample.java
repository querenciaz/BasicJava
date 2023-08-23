package Chapter07;

public class DriverExample {

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive(new Taxi());
        driver.drive(new Bus());
        Vehicle v = new Bus();

        // Bus bus = (Bus) v;
        // bus.checkFee();
        ((Bus) v).checkFee();

        method(new Bus());
    }

    private static void method(Vehicle vehicle) {
        if (vehicle instanceof Bus bus) {
            // Bus bus = (Bus) vehicle;
            bus.checkFee();
        } else {
            System.out.println("캐스팅 할 수 없습니다. ");
        }
    }
}