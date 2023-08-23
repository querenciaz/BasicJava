package Chapter06;

public class Person {
    // 필드의 선언
    // main 은 테스트 할때만 쓸예정
    String name;
    int age;
    String nation;
    // 생성자를 뜻함
    // default 생성자 = 기본 생성자 > 아무것도 없는걸 말함 값이


    public Person() {
    }

    public  Person(String name) {
        this.name = name;
    }

    public Person (String nation, String name) {
        this.nation = nation;
        this.name = name;
    }

   public Person(int age, String name) {
        this.age = age;
        this.name = name;
   }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}