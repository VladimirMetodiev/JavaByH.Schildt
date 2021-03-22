package chapter4.shape;

public class Triangle extends Form {
    public Triangle(double a, double h) {
        super(a, h);
    }

    @Override
    double calculateArea(){
        return a * h / 2.0;
    }
}
