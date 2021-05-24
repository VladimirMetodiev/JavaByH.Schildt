package chapter13.genericClassWithTwoParameters;

public class Gen<T, V> {
    T field1;
    V field2;

    Gen(T field1, V field2){
        this.field1 = field1;
        this.field2 = field2;
    }

    T getField1() {
        return field1;
    }

    void setField1(T field1) {
        this.field1 = field1;
    }

    V getField2() {
        return field2;
    }

    void setField2(V field2) {
        this.field2 = field2;
    }

    void displayGen(){
        System.out.println("Type of T is " + field1.getClass().getName());
        System.out.println("Type of V is " + field2.getClass().getName ());
    }
}
