package chapter7.useSuper;

public class SubClass extends SuperClass{
    int field;

    SubClass(int a, int b){
        super.field = a;
        this.field = b;
        System.out.println("A subclass constructor was called.");
    }

    void show() {
        System.out.println("field in superclass: " + super.field);
        System.out.println("field in subclass: " + field);
    }
}
