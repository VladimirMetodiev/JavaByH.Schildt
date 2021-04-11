package chapter7.abstractClass;

public abstract class AbstractShape {
    private double a = 0d;
    private double b = 0d;
    private double h = 0d;
    private String name = null;

    protected double getA() {
        return a;
    }

    protected void setA(double a) {
        this.a = a;
    }

    protected double getB() {
        return b;
    }

    protected void setB(double b) {
        this.b = b;
    }

    protected double getH() {
        return h;
    }

    protected void setH(double h) {
        this.h = h;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract double calculatePerimeter();
    protected abstract double calculateArea();
}
