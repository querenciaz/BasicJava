package practice;

import java.util.Random;

public class Practice25 {
    public static void main(String[] args) {

        /*
        1부터 45까지의 숫자를 배열에 담기
        배열의 데이터 섞기
        배열의 앞에서 부터 6개의 숫자 추출
        */

        Random random = new Random();
        int[] lotto = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45
        };

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i + 1;
        }

        for (int i = 0; i < lotto.length; i++) {
            int ranNum = random.nextInt(45);
            int temp = 0;
            temp = lotto[i];
            lotto[i] = lotto[ranNum];
            lotto[ranNum] = temp;

        }
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i]);
            if (i < 5) {
                System.out.print(", ");
            }
        }
    }
}