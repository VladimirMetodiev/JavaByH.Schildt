package chapter7.shapes;

public class Triangle extends TwoDimensionalShape {
    protected  Triangle() {
    }

    protected Triangle(double height, double width){
        super(height, width);
    }

    double calculateArea(){
        return getHeight() * getWidth() / 2.0;
    }

    void displayArea(){
        System.out.printf("Triangle area = %.2f%n%n", calculateArea());
    }
}
