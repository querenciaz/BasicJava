package Confilm.Confilm12;

import java.util.StringTokenizer;

public class Confilm11 {
    public static void main(String[] args) {

        String data1 = "아이디$이름$패스워드";
        StringTokenizer tokenizer = new StringTokenizer(data1, "$");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}