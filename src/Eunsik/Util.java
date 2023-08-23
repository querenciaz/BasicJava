package Eunsik;

public class Util {
    public Util() {

    }

    public boolean isContains(int[] arr, int target) {
        boolean isContains = false;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }
}