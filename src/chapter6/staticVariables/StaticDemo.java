package chapter6.staticVariables;

public class StaticDemo {
    private int x = 0;
    private static int y = 19;

    public StaticDemo() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int getSum() {
        return x + y;
    }
}
