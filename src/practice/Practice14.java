package practice;

import java.util.Random;

public class Practice14 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);  // EX) ()안에 100을 입력하면 0~99 까지의 정수를 생성함.
                                                       // 설정하고자 하는 숫자를 ()안에 입력하면 그수로 랜덤 숫자 생성.
        System.out.println("생성된 무작위의 정수 " + randomNumber);
    }
}
