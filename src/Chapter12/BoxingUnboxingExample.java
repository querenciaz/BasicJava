package Chapter12;

public class BoxingUnboxingExample {
    public static void main(String[] args) {

        Integer obj = 100; // auto boxing
        int value = obj;   // auto unboxing
        String str = new String("홍길동");
        String str2 = "홍길동";

        ;
        long startTime = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        long endTime = System.nanoTime();
        System.out.println(sum);
        System.out.println("기본타입 걸린시간: " + (endTime - startTime));

        sum = 0;
        startTime = System.nanoTime();
        for (Integer i = 0; i < 1_000_000; i++) {
            sum += i;
            // +는 기본타입만 구할수있음
            // sum 도 기본타입, i 는 포장타입 auto boxing 상태
        }  // 포장타입 auto boxing 상태여서 unboxing 후 구해야함
        System.out.println(sum);
        System.out.println(" Wrapper Class 걸린시간: " + (endTime - startTime));
    }
}
