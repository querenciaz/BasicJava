package Chapter07;

public class Computer extends Calculator {

    @Override  // 메소드가 부모 클래스에 있는 메서드를 Override 했다는 것을 명시적으로 선언
    // Annotation: 해시태그와 비슷한 느낌 에러 확인을 알수있음.
    public double areaCircle(double r) {
        super.areaCircle(r);
        return Math.PI * r * r;
    }
}
