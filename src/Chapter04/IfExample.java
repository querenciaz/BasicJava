package Chapter04;

public class IfExample {
    public static void main(String[] args) {

        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90 보다 큽니다. ");
            System.out.println("등급은 A 입니다. ");
        }

        if(score < 90)  // if 문에 {을 써야하는데 중괄호를 안쓰면 밑에 한문장만 실행된다.
            System.out.println("점수가 90 보다 작습니다. ");
        System.out.println("등급은 B 입니다. ");

        // if 문에 {을 써야하는데 중괄호를 안쓰면 밑에 한문장만 실행된다.
        // 그래서 밑에 "등급은 B 입니다." 는 if 문에 걸리지않고 출력이되는 장면이다.
    }
}
