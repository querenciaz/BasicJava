package Chapter04;

public class BreakOutterExample {
    public static void main(String[] args) {

        Outter:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower < 'z'; lower++) {
                System.out.println(upper + " - " + lower);
                if (lower == 'l') {
                    break Outter;  // 프로그램 실행 종료 로 이어짐
                }
            }
        }
        System.out.println("프로그램 실행 종료 ");
    }
}