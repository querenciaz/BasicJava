package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {

        /*
        인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("가위 바위 보를 입력하세요: ");

        while (true) {
            Random random = new Random();
            int ran = random.nextInt(3);

            String result;
            String player = scanner.nextLine();
            String rps[] = {"가위", "바위", "보"};
            String computer = rps[ran];

            if (computer.equals(player)) {
                result = "비겼습니다. ";
            } else if (computer.equals("가위") && player.equals("바위")
                    || computer.equals("바위") && player.equals("보")
                    || computer.equals("보") && player.equals("가위")) {
                result = "게이머 승리 ! ";
            } else {
                result = "컴퓨터 승리 ! ";
            }
            System.out.println("게이머: " + player);
            System.out.println("컴퓨터: " + computer);
            System.out.println("결과: " + result);
        }
    }
}


