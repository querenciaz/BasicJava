package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice29 {
    public static void main(String[] args) {

//        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
//        String email = "example@example.com";
//
//        if (email.matches(emailRegex)) {
//            System.out.println("유효한 이메일 주소입니다.");
//        } else {
//            System.out.println("유효하지 않은 이메일 주소입니다.");
//        }
//        System.out.println();

        String text = "My phone number is 123-456-7890.";
        String phoneNumberRegex = "\\d{3}-\\d{3}-\\d{4}";

        Pattern pattern = Pattern.compile(phoneNumberRegex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            String phoneNumber = matcher.group();
            System.out.println("추출된 전화번호: " + phoneNumber);
        } else {
            System.out.println("전화번호를 찾을 수 없습니다.");
        }

    }
}
