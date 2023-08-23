package Confilm.Confilm12;

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "";
        // "" 문자열 변수
        StringBuilder builder = new StringBuilder();
        // 빈 문자열을 다루는 데 사용되는 StringBuilder

        for (int i = 1; i <= 100; i++) {
            builder.append(i);
            // builder 객체에 현재 숫자 i를 문자열로 변환하여 추가합니다.
            // StringBuilder는 내부적으로 문자열을 더하는 방식으로 문자열을 효율적으로 처리합니다.
        }
        str = builder.toString();
        // 객체에 누적된 문자열을 최종적으로 문자열로 변환하여 str 변수에 저장합니다.
        System.out.println(str);
        // 1부터 100까지의 숫자를 모두 하나의 문자열로 빌드하고, 이를 효율적으로 처리하기 위해 StringBuilder 클래스를 사용하는 방법을 보여줍니다.
        // StringBuilder는 문자열을 수정 가능한 형태로 관리하며, 문자열을 여러 번 조작하거나 더할 때 String 클래스보다 성능상 이점을 제공합니다.
    }
}