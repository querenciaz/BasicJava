package Chapter07.abs;

public class Cat extends Animal{

    // 추상메소드 재정의
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
