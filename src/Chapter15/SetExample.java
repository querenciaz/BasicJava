package Chapter15;

import java.util.*;
public class SetExample {
    public static void main(String[] args) {

        // HashSet 컬렉션 생성
        HashSet<String> subjects = new HashSet<>();
        subjects.add("Java");
        subjects.add("JDBC");
        subjects.add("JSP");
        subjects.add("java");
        subjects.add("Spring");
        subjects.add("Jsp");
        subjects.add("Spring");

        System.out.println("총 개수: " + subjects.size());

        // Set 의 데이터 가져오는 방법
        // 1. Iterator (반복자)를 통해 가져오기
        Iterator<String> iterator = subjects.iterator(); // 문자열로 데이터를 반복적으로 가져옴
        while (iterator.hasNext()) {  // 꺼낼게 없을때 까지 전체를 다 가져옴 // hasNext() 는 true / false 를 판별
            String subject = iterator.next();
            System.out.println(subject);
        }
        System.out.println();

        System.out.println("foreach 문을 통해 출력");
        // 2. foreach 문을 통해 가져오기
        for (String subject : subjects) {
            System.out.println(subject);
        }

    }
}
