package Chapter13;

public class Box<T> {

     private T value;

    public Box(T value) {     // object obj = new String();
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
