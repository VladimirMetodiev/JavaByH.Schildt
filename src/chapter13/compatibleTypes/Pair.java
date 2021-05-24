package chapter13.compatibleTypes;

public class Pair<T, V extends T> {
    T field1;
    V field2;

    public Pair(T field1, V field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public T getField1() {
        return field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }

    public V getField2() {
        return field2;
    }

    public void setField2(V field2) {
        this.field2 = field2;
    }

    void display(){
        System.out.println("Type of T is " + field1.getClass().getName());
        System.out.println("Type of V is " + field2.getClass().getName ());
    }
}
