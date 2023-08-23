package practice;

public class Practice22 {
    public static void main(String[] args) {

        int[][] array = {
                {95, 86},             // array0 > 2
                {83,92,96},           // array1 > 3
                {78,83,93,87,88}      // array2 > 5
        };                            // 반복문은 2개 바깥쪽(가로) + 안쪽(세로)

        System.out.println(array.length);
        System.out.println(array[2].length);
    }
}
