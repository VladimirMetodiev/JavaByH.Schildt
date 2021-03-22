package chapter4.shape;

public class Trapezium extends Form {
    double b = 0.0;

    public Trapezium(double a, double h, double b) {
        super(a, h);
        this.b = b;
    }

    @Override
    double calculateArea(){
        return ((a + b) * h) / 2.0;
    }
}
