package Chapter16;

public class MethodReferenceExample {
    public static void main(String[] args) {

        Person person = new Person();                          // (a,b) -> a.compareToIgnoreCase(b)
        // (s, str) -> s.compareToIgnoreCase(str)
        // person,ordering((s, str) -> s.compareToIgnoreCase(str);
        person.ordering(String :: compareToIgnoreCase);        // 대소문자를 무시하고 문자열을 비교합니다

//        person.ordering((s, str) -> {
//            return s.compareToIgnoreCase(str);
//        });
    }
}
