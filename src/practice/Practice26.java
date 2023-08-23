package practice;

import java.util.Random;

public class Practice26 {

    Random random = new Random();


    public static boolean isContains(int[] arr, int target) {
        boolean isContains = false;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }


    public static void main(String[] args) {
        int[] arr = {4, 6, 43, 7, 24, 6, 2, 6};

        int max = MAX(arr);
        for (int i = 0; i < 5; i++) {

        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }

    public static int MAX(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}