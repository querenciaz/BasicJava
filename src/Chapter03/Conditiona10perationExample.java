package Chapter03;

public class Conditiona10perationExample {
    public static void main(String[] args) {

        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');  // 삼항연산자 조건으로 만들어지는 문장
                                                                        // 85 > 90 A / 85>80 B / 80보다 작으면 C
        System.out.println(score + "점은 " + grade + "등급입니다. ");
    }
}
