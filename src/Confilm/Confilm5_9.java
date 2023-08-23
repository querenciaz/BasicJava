package Confilm;

import java.util.Scanner;

public class Confilm5_9 {
    public static void main(String[] args) {

        /*
        학생들의 점수를 분석하는 프로그램을 만들려고합니다.
        키보드로부터 학생 수와 각 학생들의 점수를 입력받고 while 문과 Scanner 의 nextLine() 메소드를 이용해서
        최고 점수 및 편균 점수를 출력하는 코드를 작성해 보시오.
         */

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int studentCount = 0;
        int[] scores = null;


        while (run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
            System.out.println("----------------------------------------------------");
            System.out.print("선택> ");

            int numBer = Integer.parseInt(scanner.nextLine());

            switch (numBer) {
                case 1:
                    System.out.print("학생수> ");
                    studentCount = Integer.parseInt(scanner.nextLine());
                    scores = new int[studentCount];
                    break;

                case 2:
                    if (scores == null) {
                        System.out.print("학생수를 입력해주시오. ");
                    } else {
                        for (int i = 0; i < scores.length; i++) {
                            System.out.printf("(scores[%d])", i);
                             scores[i] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;

                case 3: {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.printf("scores[%d]: %d\n ", i, scores[i]);
                    }
                }
                break;

                case 4:
                int max = 0;
                double avg = 0;
                int sum = 0;
                    for (int i = 0; i < scores.length; i++) {
                        if (max < scores[i]) {
                            max = scores[i];
                        }
                        sum += scores[i];
                    }
                    avg = (double) sum / scores.length;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점숨: " + avg);
                    break;

                case 5:
                    run = false;
                    System.out.println("프로그램 종료 ");
                    break;
            }
        }
    }
}
