package Confilm.Example;

public class Member {

    String name;
    String id;
    String password;
    int age;

    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }
    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
}