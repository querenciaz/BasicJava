package Chapter06;

public class PersonExample {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "박보검";
        person1.age = 29;

        Person person2 = new Person();
        person2.name = "아이유";
        person2.age = 28;

        Person person3 = new Person();
        person3.name = "홍길동";
        person3.age = 35;
        // Heap 안에 객체가 3개가 만들어짐

        Person person4 = new Person();
        System.out.println(person4.name);
    }
}


