package chapter7.useSuper;

public class SubClassTwo extends SuperClass {
    int someField = 0;

    SubClassTwo(int a, int b){
        super.field = a;
        this.someField = b;
        System.out.println("A subclass constructor was called.");
    }
}
