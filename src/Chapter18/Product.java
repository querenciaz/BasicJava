package Chapter18;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[상품]"+ name + ":" + price;
    }
}
