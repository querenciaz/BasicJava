package Practice2;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("가위 바위 보 게임 !");
        System.out.println();

        System.out.print("철수: ");
        String chulSoo = scanner.nextLine();
        System.out.println("영희: ");
        String youngHee = scanner.nextLine();
        String result;

        if (chulSoo.equals(youngHee)) {
            result = "비겼습니다. ";
        } else if (chulSoo.equals("가위") && youngHee.equals("바위")
                || chulSoo.equals("바위") && youngHee.equals("보")
                || chulSoo.equals("보") && youngHee.equals("가위")) {
            result = "영희 승리 !";
        } else {
            result = "철수 승리 !";
        }
        System.out.println("결과 " + result);
    }
}
