package chapter7.shapes;

public class TwoDimensionalShape {
    private double height = 0.0;
    private double width = 0.0;

    protected TwoDimensionalShape(){
    }

    protected TwoDimensionalShape(double height, double width){
        this.height = height;
        this.width = width;
    }

    protected TwoDimensionalShape(double var){
        this.height = var;
        this.width = var;
    }

    protected TwoDimensionalShape(TwoDimensionalShape obj){
        this.height = obj.height;
        this.width = obj.width;
    }

    protected  double getHeight() {
        return height;
    }

    protected  void setHeight(double height) {
        this.height = height;
    }

    protected  double getWidth() {
        return width;
    }

    protected  void setWidth(double width) {
        this.width = width;
    }

    protected void displayDimension(){
        System.out.printf("Height = %.2f%nWidth = %.2f%n", height, width);
    }
}
