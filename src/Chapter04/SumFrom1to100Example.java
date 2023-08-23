package Chapter04;

public class SumFrom1to100Example {
    public static void main(String[] args) {

        int sum = 0; // int sum=0; = sum << 합계 변수
        int i;      // int i; = (i-1) << 카운터 변수

        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~ " + (i - 1) + " 합 : " + sum);
    }
}
