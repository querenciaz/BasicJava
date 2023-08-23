package EX;

import java.util.Scanner;

public class Rsp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("가위 바위 보 게임 !");
        System.out.println();

        System.out.print("철수: ");
        String cs = scanner.nextLine();
        System.out.print("영희: ");
        String yh = scanner.nextLine();
        String result;

        if (cs.equals(yh)) {
            result = "비겼습니다 !";
        } else if (cs.equals("가위") && yh.equals("바위")
                || cs.equals("바위") && yh.equals("보")
                || cs.equals("보") && yh.equals("가위")) {
            result = "영희 승리 !";
        } else {
            result = "철수 승리 !";
        }
        System.out.println("결과: " + result);
    }
}
