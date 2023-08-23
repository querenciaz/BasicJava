package Chapter02;

public class FloatDoubleExample {
    public static void main(String[] args) {
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        // 실수는 float 간주X Double 간주O
        // 작은타입을 큰타입으로 담기쉬움
        // 큰타입을 작은 탑으로 담기 어려움
        // 담을수는 있지만 정해진 용량만큼담음
        // float 에서 double 간주할떄는 float 사용
        System.out.println(var1); // 유효숫자 7자리까지 출력
        System.out.println(var2); // 유효숫자 15자리까지 출력
        // 지수 표현식
        // 100 > 1.0 * 10^2
        // 0.0000123 > 1.23 *10^-5
        double var3 = 1.0e2; // EX) 100 > 1.0 * 10^2를 표현
        double var4 = 1.23e-5;  // EX) 0.0000123 > 1.23 *10^-5
        System.out.println(var3);
        System.out.println(var4);
    }
}