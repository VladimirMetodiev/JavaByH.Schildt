package chapter6.constructorOverload;

public class TestConstructors {
    private int x;

    TestConstructors() {
        System.out.println("Inside NewClass().");
        x = 0;
    }

    TestConstructors(int i) {
        System.out.println("Inside NewClass(int).");
        x = i;
    }

    TestConstructors(double d) {
        System.out.println("Inside NewClass(double).");
        x = (int) d;
    }

    TestConstructors(int i, int j) {
        System.out.println("Inside NewClass(int, int).");
        x = i * j;
    }

    public int getX() {
        return x;
    }
}
