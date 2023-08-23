package practice;

public class Practice15 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            System.out.printf("*** %d단 ***\n ", i); // /n 은 밑줄로 넘어가기
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n ", i, j, i*j);
            }
        }
    }
}
