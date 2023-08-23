package practice;

public class Practice24 {
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 8, 2};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("최소값: " + min);
    }
}
