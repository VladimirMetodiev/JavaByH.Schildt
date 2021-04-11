package chapter7.abstractClass;

public class Rectangle extends AbstractShape implements Displayable {
    public Rectangle(double a, double b, double h) {
        setA(a);
        setB(b);
        setH(h);
        setName("Rectangle");
    }

    protected double calculatePerimeter(){
        return getA() + getA() + getB() + getB();
    }

    protected double calculateArea(){
        return getA() * getH();
    }

    public void display(){
        System.out.println(getName() + " perimeter = " + calculatePerimeter());
        System.out.println(getName() + " area = " + calculateArea() + "\n");
    }
}
