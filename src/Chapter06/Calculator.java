package Chapter06;

public class Calculator {

    // 리턴값이 없는 메소드 선언
    void powerOn() {
        System.out.println("전원을 켭니다. ");
    }

    // 리턴값이 없는 메소드 선언
    void powerOff() {
        System.out.println("전원을 끕니다. ");
    }

    // 호출시 두 정수 값을 전달받고, 호출한 곳으로 결과값을 int 를 리턴하는 메소드 선언
    int plus(int x, int y) {
        int result = x + y;
        return result;  // 리턴값을 지정;
    }

    // 호출시 두 정수 값을 전달 받고, 호출한 곳으로 결과값 double 을 리턴하는 메소드 선언
    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result; // 리턴값을 지정;

        /* 책반납할떄 쓰는 표현이 RETURN
           왜 WHY? 쓸때는 썌거 반납할떄는 흔거 처럼 값이 다름
        */
    }
}