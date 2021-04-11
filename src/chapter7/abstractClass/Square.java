package chapter7.abstractClass;

public class Square extends AbstractShape implements Displayable {
    public Square(double a, double b, double h) {
        setA(a);
        setB(b);
        setH(h);
        setName("Square");
    }

    protected double calculatePerimeter(){
        return 4 * getA();
    }

    protected double calculateArea(){
        return getA() * getB();
    }

    public void display(){
        System.out.println(getName() + " perimeter = " + calculatePerimeter());
        System.out.println(getName() + " area = " + calculateArea() + "\n");
    }
}
