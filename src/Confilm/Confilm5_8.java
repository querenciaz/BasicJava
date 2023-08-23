package Confilm;

public class Confilm5_8 {
    public static void main(String[] args) {

        // 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 중첩 for 문 이용하여 작성해 보시오.

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("전체 합: " + sum);
        System.out.println("전체 평균: " + average);
    }
}
