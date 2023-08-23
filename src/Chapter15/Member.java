package Chapter15;

public class Member {

    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }


//    이 코드는 Java에서 `equals` 메소드를 재정의(오버라이딩)한 내용을 나타냅니다.
//    `equals` 메소드는 객체의 동등성을 비교하는데 사용되며, 객체 간의 내용이 같은지 비교할 때 유용합니다.
//    보통 `equals` 메소드를 사용하여 두 객체의 필드 값이 동일한지 비교합니다.
//    이 코드는 `equals` 메소드를 구현하는 예시입니다. 주어진 객체(`obj`)가 `Member` 클래스의 인스턴스인지 확인하고,
//    만약 맞다면 `name`과 `age` 필드의 값이 같은지 비교합니다. 이 때, `target`은 `obj`를 `Member` 타입으로 캐스팅한 변수입니다.
//    `name`과 `age` 필드의 값이 모두 같다면 `true`를 반환하고, 그렇지 않다면 `false`를 반환합니다.
//    이렇게 `equals` 메소드를 재정의하여 객체의 동등성 비교를 커스텀하게 정의할 수 있습니다.
//    이때 중요한 것은 `equals` 메소드의 파라미터로 전달되는 객체는 `Object` 타입이므로 적절한 타입으로 캐스팅하여 필드 값을 비교해야 합니다.

}