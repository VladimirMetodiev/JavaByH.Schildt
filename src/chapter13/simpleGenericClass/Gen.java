package chapter13.simpleGenericClass;

public class Gen<T> {
    T obj;      // декларирам обект от тип Т

    Gen(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type of T is " + obj.getClass().getName());
    }
}
