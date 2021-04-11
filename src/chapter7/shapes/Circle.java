package chapter7.shapes;

public class Circle extends TwoDimensionalShape {
    public Circle(double radius) {
        super(radius);
    }

    protected double calculateArea(){ return Math.PI * Math.pow(getHeight(), 2); }

    protected void displayArea(){
        System.out.printf("Circle area = %.2f%n%n", calculateArea());
    }

    @Override
    protected void displayDimension(){
        System.out.printf("Radius = %.2f%n", getHeight());
    }
}
