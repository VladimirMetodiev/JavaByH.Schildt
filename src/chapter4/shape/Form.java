package chapter4.shape;

public class Form {
    double a = 0.0;
    double h = 0.0;

    public Form(double a, double h) {
        this.a = a;
        this.h = h;
    }

    double calculateArea(){
        return a * h;
    }
}
