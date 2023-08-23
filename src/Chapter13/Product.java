package Chapter13;

public class Product<K, M> {
    // 종류 Kind K / 모델 Model M

    private K kind;
    private M model;

    public K getKind() {
        return kind;
    }
    public void setKind(K kind) {
        this.kind = kind;
    }
    public M getModel() {
        return model;
    }
    public void setModel(M model) {
        this.model = model;
    }


}
