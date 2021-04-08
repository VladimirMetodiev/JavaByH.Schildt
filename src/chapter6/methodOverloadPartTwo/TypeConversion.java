package chapter6.methodOverloadPartTwo;

public class TypeConversion {
    public static void main(String args[]) {
        Overload2 obj = new Overload2();

        byte b = 127;
        short s = 3567;
        int i = 101;
        float f = 11.52F;
        double d = 110.125125125;

        obj.f(b); // calls ob.f(int) -- type conversion
        obj.f(s); // calls ob.f(int) -- type conversion
        obj.f(i); // calls ob.f(int)
        obj.f(f); // calls ob.f(double) -- type conversion
        obj.f(d); // calls ob.f(double)
    }
}
