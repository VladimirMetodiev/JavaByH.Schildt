package chapter7.abstractClass;

public class Parallelogram extends AbstractShape implements Displayable {
    public Parallelogram(double a, double b, double h) {
        setA(a);
        setB(b);
        setH(h);
        setName("Parallelogram");
    }

    protected double calculatePerimeter(){
        return 2 * getA() + 2 * getB();
    }

    protected double calculateArea(){
        return getA() * getH();
    }

    public void display(){
        System.out.println(getName() + " perimeter = " + calculatePerimeter());
        System.out.println(getName() + " area = " + calculateArea() + "\n");
    }
}
