package Chapter11;

public class ThrowsExample {
    public static void main(String[] args) throws ClassNotFoundException {
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String");
    }
}
