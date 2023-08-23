package Exercise;

import java.util.Random;

public class Exercise52 {
    public static void main(String[] args) {
        /*
        로또번호를 생성하는 프로그램을 작성하시오.
        (로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
         */

        Random random = new Random();
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                }
            }
            System.out.println("로또번호: " + lotto[i]);
        }
        // for (int i = 0; i < lotto.length; i++) {
           // System.out.println("로또번호 " + lotto[i]);
        }
    }
