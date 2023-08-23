package Exercise;

import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {

        /*
        사용자로부터 특정 월을 입력받은 후, 입력 받은 월의 계절이 어떤 계절인지 알아내는 프로그램을 만들어 보자.
        3월~5월은 봄, 6월~8월은 여름, 9월~11월은 가을, 12월~2월은 겨울을 출력한다.

        실행 결과는 3번 반복되어 있지만 1번만 나오도록 작성하시면 됩니다.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("월을 입력해 주세요(1~12): ");
        int month = scanner.nextInt();
        String season = "";

        switch (month) {
            case 3:
            case 4:
            case 5:
                season = (month + "월은 봄입니다. ");
                break;
            case 6:
            case 7:
            case 8:
                season = (month + "월은 여름입니다. ");
                break;
            case 9:
            case 10:
            case 11:
                season = (month + "월은 가을입니다. ");
                break;
            case 12:
            case 1:
            case 2:
                season = (month + "월은 겨울입니다. ");
                break;
            default:
                season = (month + "월은 잘못된 입력입니다. ");
                break;
        }
        System.out.println(season);
    }
}