package EX;

public class One99 {
    public static void main(String[] args) {


        final int TARGET_NUMBER = 8;
        final int MAX_COUNT = 99;
        final int PRINT_INTERVAL = 8;

        int count = 0;

        for (int i = 1; i <= MAX_COUNT; i++) {
            if (i % TARGET_NUMBER == 0) {
                count++;
                if (count == PRINT_INTERVAL) {
                    System.out.println(i);
                    count = 0;
                }
            }
        }
    }
}