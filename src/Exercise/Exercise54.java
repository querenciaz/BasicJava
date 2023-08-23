package Exercise;

import java.util.Random;

public class Exercise54 {
    public static void main(String[] args) {

        /*
        주사위를 던져서 각 면이 나오는 횟수를 출력하는 프로그램을 만들어 보자.
        주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는 난수 발생기(Random 객체)가 대신한다.
        난수 발생기를 10,000번 호출하여 각 면이 나타나는 횟수를 계산하여 배열에 저장한다.
        확률 이론에 의하면 주사위의 각각의 면들이 거의 동일한 횟수로 나와야 한다.
        아래 그림과 똑같은 값이 나오지 않고 컴퓨터마다 값이 다르게 나오는 것이 정상이다.
        */

        System.out.println("-------------");
        System.out.println("면        빈도 ");
        System.out.println("-------------");

        int[] dice = new int[6];
        Random random = new Random();

        for (int i = 1; i < 10000; i++) {
            int diceRandom = random.nextInt(6) + 1;

            switch (diceRandom) {
                case 1:
                    dice[0]++;
                    break;

                case 2:
                    dice[1]++;
                    break;

                case 3:
                    dice[2]++;
                    break;

                case 4:
                    dice[3]++;
                    break;

                case 5:
                    dice[4]++;
                    break;

                case 6:
                    dice[5]++;
                    break;
            }
        }
        System.out.println("1        " + dice[0]);
        System.out.println("2        " + dice[1]);
        System.out.println("3        " + dice[2]);
        System.out.println("4        " + dice[3]);
        System.out.println("5        " + dice[4]);
        System.out.println("6        " + dice[5]);

        /*
        int[] dice = new int[6];
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
        dice[random.nextInt(6)] +=1;

        for (int i = 0; i < dice.length; i++) {
        System.out.println(i+1 + "       " + dice);
         */
    }
}
