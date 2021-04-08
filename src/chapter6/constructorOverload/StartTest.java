package chapter6.constructorOverload;

public class StartTest {
    public static void main(String args[]) {
        TestConstructors obj1 = new TestConstructors();
        System.out.println("obj1.getX(): " + obj1.getX() + "\n");

        TestConstructors obj2 = new TestConstructors(88);
        System.out.println("obj2.getX(): " + obj2.getX() + "\n");

        TestConstructors obj3 = new TestConstructors(17.23);
        System.out.println("obj3.getX(): " + obj3.getX() + "\n");

        TestConstructors obj4 = new TestConstructors(2, 4);
        System.out.println("obj4.getX(): " + obj4.getX());
    }
}
