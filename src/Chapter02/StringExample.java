package Chapter02;

public class StringExample {
        public static void main(String[] args) {
            // 참조 타입
            int a =100;
            String b = "b";  // String 참조타입 " 사용
            String name = "홍길동";
            String job = "프로게이머";
            String str = "나는 \"자바\"를 배웁니다.";
            System.out.println(str);
            // 깅조할 문구에 위에 처럼 \ 줘야함
            /*
            역슬래시(\) 다음에
            \"
            \'
            \t   // tap 공백으로 표현할걸 EX) 4칸으로 떨어뜨림
            \n   // new line(line feed)
            \r   // carriage return
            \\
             */
            String multistr = """
                    여러 라인을
                    문자열로 표현
                    가능합니다.
                    """;
            System.out.println(multistr);
            // 자바13버전 부터 사용 가능
    }
}
