package Chapter04;

import java.util.Random;

public class SwitchNoBreakExample {
    public static void main(String[] args) {

        Random random = new Random();
        int ranNum = random.nextInt(4) + 8;
        System.out.println("[현재 시간 : " + ranNum + "시] ");

        switch (ranNum) {
            case 8:
                System.out.println("출근합니다. ");
            case 9:
                System.out.println("회의를 합니다. ");
            case 10:
                System.out.println("업무를 봅니다. ");
            default:
                System.out.println("외근을 나갑니다. ");
        }
    }
}
