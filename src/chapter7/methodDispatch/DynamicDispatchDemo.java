package chapter7.methodDispatch;

public class DynamicDispatchDemo {
    public static void main(String args[]) {
        SuperClass superObj = new SuperClass();
        SubClass1 subObj1 = new SubClass1();
        SubClass2 subObj2 = new SubClass2();

        SuperClass superClassRef;

        superClassRef = superObj;
        superClassRef.who();

        superClassRef = subObj1;
        superClassRef.who();

        superClassRef = subObj2;
        superClassRef.who();
    }
}
