package Confilm.Confilm8;

import Confilm.Confilm8.A;
import Confilm.Confilm8.B;
import Confilm.Confilm8.C;

public class Example {
    public static void action(A a) {
        a.method1();
        if (a instanceof C c) {
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}

/*
이 코드는 다형성(polymorphism)과 instanceof 연산자를 이용하여 메소드를 호출하는 예제입니다.

    클래스 A, B, C:
        클래스 A는 메소드 method1()을 가지고 있습니다.
        클래스 B는 클래스 A를 상속받아 메소드 method1()을 오버라이딩하고 있습니다.
        클래스 C는 클래스 A를 상속받아 메소드 method1()을 오버라이딩하고 있으며, 추가적으로 메소드 method2()를 가지고 있습니다.

    Example 클래스:
        action(A a) 메소드는 A 클래스의 객체를 매개변수로 받습니다.
        a.method1()은 주어진 객체의 method1() 메소드를 호출합니다.
        if (a instanceof C c)는 주어진 객체가 C 클래스의 객체인지 확인합니다.
        c.method2()는 C 클래스의 객체일 경우에만 method2() 메소드를 호출합니다.

    main() 메소드:
        action(new B()): B 클래스의 객체를 action() 메소드에 전달하면, B 클래스는 A 클래스를 상속받았기 때문에 method1()이 호출됩니다.
        action(new C()): C 클래스의 객체를 action() 메소드에 전달하면, C 클래스는 A 클래스를 상속받고 method2()를 가지고 있으므로 method1()과 method2()가 모두 호출됩니다.

이렇게 메소드의 매개변수를 상위 클래스 타입으로 선언하고, 실제로 하위 클래스의 객체를 전달하여 다형성을 이용하여 메소드를 호출하는 것이 객체지향 프로그래밍의 중요한 특성 중 하나입니다.
instanceof 연산자를 사용하여 객체의 타입을 확인하고, 해당 타입에 따라 다른 동작을 수행할 수 있습니다.
*/