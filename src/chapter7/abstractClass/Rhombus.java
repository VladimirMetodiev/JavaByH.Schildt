package chapter7.abstractClass;

public class Rhombus extends AbstractShape implements Displayable {
    public Rhombus(double a, double b, double h) {
        setA(a);
        setB(b);
        setH(h);
        setName("Rhombus");
    }

    protected double calculatePerimeter(){
        return 4 * getA();
    }

    protected double calculateArea(){
        return getA() * getH();
    }

    public void display(){
        System.out.println(getName() + " perimeter = " + calculatePerimeter());
        System.out.println(getName() + " area = " + calculateArea() + "\n");
    }
}
