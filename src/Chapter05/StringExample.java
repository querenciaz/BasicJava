package Chapter05;

public class StringExample {
    public static void main(String[] args) {

        String a = "홍";
        String b = "홍";
        System.out.println(a == b);

        String c = new String("홍");
        String d = new String("홍");
        System.out.println(c == d);

        String f = "홍";
        String g = "홍";
        System.out.println(f == g);
    }
}
