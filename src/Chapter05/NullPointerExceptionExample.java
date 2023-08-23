package Chapter05;

import java.util.Random;

public class NullPointerExceptionExample {
    public static void main(String[] args) {

        Random random = null;
        int num = random.nextInt(6);                 // null 을 참조(random random)중인데 nextint 를 작성했을떄
        System.out.println(num);                           // 작성하였을때는 문제가 없지만 실행을하면 NullpointrException error 발생
        String str = null;                                 // 호출 = call(개발자가 부를때 사용) = invoke(기계가 부를떄 사용)
        System.out.println("총 문자수: " + str.length());    // null 을 입력하면 . 을찍고 뭘할수가 없다 = error 발생


    }
}
