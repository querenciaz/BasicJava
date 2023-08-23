package Chapter04;

public class IfElseExample {
    public static void main(String[] args) {

        int score = 85;

        if(score >= 90) {
            System.out.println("점수가 90 보다 큽니다. ");
            System.out.println("등급은 A 입니다. ");
        } else {
            System.out.println("점수가 90 보다 작습니다. ");
            System.out.println("등급은 B 입니다. ");

            // else 는 if 문에 조건 하나를 더추가해서 또다른 답이 나오게 하는것
            // EX) 90보다 크면 첫문장에서 끝나지만, 90보다 작으면  else 밑에 문장으로 실행

        }
    }
}
