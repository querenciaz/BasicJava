package Chapter07;

public class SmartPhone extends Phone {           // 부모: phone, 자식:SmartPhone

    public boolean wifi;

    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("Phone(String model, String color) 생성자 실행됨");
        // this.model = model;
        // this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다. ");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다. ");
    }
}
