package Chapter02;

public class StringConcatExmaple {
    public static void main(String[] args) {
        // + 연산자
        int result = 10 + 2 + 8;
        String result2 = 10 + 2 + "8";
        // 숫자를 문자 로바꾸는건 위험성 적음
        // 문자를 숫자로 바꾸는건 위험성 높음
        // EX) 10 > "10" 위험성 적음
        //    "10" > 10  위험성 높음
        // 따라서 "10 > 10 >> "10" > "10"
        // 숫자를 문자로 캐스팅
        // 숫자 뒤에 큰따옴표를 더한다.
        int a = 10;
        String str = a + "";
        //문자를 숫자로 캐스팅
        String value = "100";
        int i = Integer.parseInt(value);// parseint 원하는 형태로
        double v = Double.parseDouble(value);
    }
}
