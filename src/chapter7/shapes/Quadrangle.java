package chapter7.shapes;

public class Quadrangle extends TwoDimensionalShape {
    protected Quadrangle() {
    }

    protected Quadrangle(double height, double width){
        super(height, width);
    }

    boolean isItSquare(){
        if(getHeight() == getWidth()) return true;
        else return false;
    }

    void displayQuadrangle(){
        if(isItSquare()) System.out.println("This is square");
        else System.out.println("This is rectangle");
    }

    double calculateArea(){
        return getHeight() * getWidth();
    }

    void displayArea(){
        System.out.printf("%s area = %.2f%n%n", isItSquare() ? "Square" : "Rectangle", calculateArea());
    }
}
