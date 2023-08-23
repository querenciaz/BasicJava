package Confilm.Example;

public class MemberService {

    String id;
    String password;

    public boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            System.out.println("로그인 되었습니다. ");
            return true;
        } else {
            System.out.println("id 또는 password 가 올바르지 않습니다. ");
            return false;
        }
    }
    // public boolean login(String id, String password) {
    //         return id.equals("hong") && password.equals("12345");

    public void logout(String id) {
        System.out.println(id + " 님이 로그아웃 되었습니다. ");
    }
}