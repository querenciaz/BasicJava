package Confilm;

public class Confilm5_7 {
    public static void main(String[] args) {

        // 주어진 배열 항목에서 최대값을 출력하는 코드를 for 문 이용하여 작성해보시오.

        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {  // 현재 요소가 맥스값 보다 크면
                max = array[i];    // 멕스값을 현재값으로 업데이트
            }
        }
        System.out.println("최대값: " + max);
    }
}
