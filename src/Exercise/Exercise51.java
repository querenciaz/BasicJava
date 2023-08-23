package Exercise;

public class Exercise51 {
    public static void main(String[] args) {
        /*
        다음 배열에서 최대값과 최소값을 구하시오.
        {38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
         */

        int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}