package chapter7.shapes;

public class Trapezium extends TwoDimensionalShape{
    private double anotherSide = 0.0;

    public Trapezium(double height, double width, double anotherSide) {
        super(height, width);
        this.anotherSide = anotherSide;
    }

    @Override
    protected void displayDimension(){
        System.out.printf("The height = %.2f%nThe first side = %.2f%nThe second side = %.2f%n", getHeight(), getWidth(), anotherSide);
    }

    double calculateArea(){
        return getHeight() * (getWidth() + anotherSide) / 2.0;
    }

    void displayArea(){
        System.out.printf("Trapezium area = %.2f%n%n", calculateArea());
    }
}
