package Chapter04;

import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {

        Random random = new Random();                 // seed 는 똑같이 나오게 하는거 (seed = 씨앗 = 콩씨앗 = 콩이 자람)
        int ranNum = random.nextInt(6) + 1;    // EX) bound 는 7을 입력하였을떄 0은 포함하지만 7은 포함 안함 0~6으로 설정
                                                     // EX) (bound:45(갯수)) + 1(시작하는숫자)
                                                     // EX) ()안에 100을 입력하면 0~99 까지의 정수를 생성함.
                                                     // 설정하고자 하는 숫자를 ()안에 입력하면 그수로 랜덤 숫자 생성.

        if(ranNum == 1) {
            System.out.println("1번이 나왔습니다. ");
        } else if (ranNum == 2) {
            System.out.println("2번이 나왔습니다. ");
        } else if (ranNum == 3) {
            System.out.println("3번이 나왔습니다. ");
        } else if (ranNum == 4) {
            System.out.println("4번이 나왔습니다. ");
        } else if (ranNum == 5) {
            System.out.println("5번이 나왔습니다. ");
        } else {
            System.out.println("6번이 나왔습니다. ");
        }
    }
}
