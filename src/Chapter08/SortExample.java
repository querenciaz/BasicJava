package Chapter08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 2, 8, 110, 22, 4, 87};
        String[] names = {"홍길동", "이순신", "신용권", "임경철"};

        Student[] students = {
                new Student("김은식", 1, 15),
                new Student("이승기", 2, 17),
                new Student("박서준", 3, 18),
                new Student("김채원", 4, 19),
                new Student("아이유", 5, 25),
                new Student("신동석", 6, 48),
                new Student("정채원", 7, 78),
                new Student("김사랑", 8, 125),
        };
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);
        // (compareTo 규격)에 맞는 거만 입력해주면 비교해서 정렬해준다.
        System.out.println("변경후");
        System.out.println("------------");
        System.out.println(Arrays.toString(students));
    }
}