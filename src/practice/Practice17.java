package practice;

import java.util.Random;

public class Practice17 {
    public static void main(String[] args) {

        Random random = new Random();
        int dice1, dice2, sum;

        do {
            dice1 = random.nextInt(6) +1;
            dice2 = random.nextInt(6) +1;
            sum = dice1 + dice2;
            System.out.println("주사위1 + " + dice1 + " 주사위2 = " + dice2 +  "주사위의 합 " + sum);
        }while (sum !=5);
    }
}