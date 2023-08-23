package practice;

public class Practice16 {
    public static void main(String[] args) {

        int sum = 0;
        int i, j;

        for ( i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        for ( j = 1; j <= 100; j++) {
            if (j % 3 == 0) {
                sum += j;
            }
        }
        System.out.println();
        System.out.println("1부터100까지 중 3배수의 합  =  " + sum);
    }
}
