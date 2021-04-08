package chapter6.parallelepipeds;

public class Parallelepiped {
    private double a = 0.0;
    private double b = 0.0;
    private double c = 0.0;
    private double volume;

    public Parallelepiped(){}

    public Parallelepiped(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.volume = a * b * c;
    }

    public double getVolume() {
        return volume;
    }

    public static boolean compareShapes(Parallelepiped obj1, Parallelepiped obj2){
        if(obj1.a == obj2.a && obj1.b == obj2.b && obj1.c == obj2.c) return true;
        else return false;
    }
}
