package Confilm.Confilm12;

import java.util.regex.Pattern;

public class Confilm17 {
    public static void main(String[] args) {

        String id = "a5Angel1004";
        String regExp = "^[a-zA-z][a-zA-z0-9]{7,11}";
        boolean isMatch = Pattern.matches(regExp, id);
        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}
