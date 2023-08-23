package Chapter12;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {

        String data1 = "홍길동$이수홍$박연수$감자바$최명호$김지철";
        String data11 = "홍길동$이수홍$박연수$감자바";
        String data111 = "홍길동$이수홍$박연수$감자바$최명호$이순신";
        String data2 = "홍길동,이수홍,박연수,감자바-최명호";
        String[] data1Split = data1.split("\\$");
        System.out.println(Arrays.toString(data1Split));
        String[] data2Split = data2.split("[&,-]");
        System.out.println(Arrays.toString(data2Split));
        System.out.println();

        StringTokenizer tokenizer = new StringTokenizer(data1, "$");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}