package Eunsik;

public class ClassExample {
    public static void main(String[] args) {
        int[] arr = {43, 6, 23, 6, 2, 661, 5712, 735};

        Util util = new Util();

        // 수행부
        boolean isContains = (util.isContains(arr, 23));
        System.out.println("23 is contains " + isContains);
    }
}