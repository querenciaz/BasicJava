package Chapter05;

public class AdvancedForExample {
    public static void main(String[] args) {

        // 배열 변수 선언과 배열 생성
        int[] scores = {95, 71, 84, 93, 87};

        // 배열 항목 전체 합 구하기
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        System.out.println("점수 총합 = " + sum);

        // 배열 항목 전체 평균 구하기
        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);

        // 고조선 > fori
        // 근현대 > foreach
        // 최근트렌드 > fori나 foreach를 쓰지 않는 방식 : 함수형 프로그래밍 방식 stream API(JDK 1.8에 추가된 방식)
    }
}