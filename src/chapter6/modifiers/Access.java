package chapter6.modifiers;

public class Access {
    public static void main(String args[]) {
        SomeModifiers someObject = new SomeModifiers();

        someObject.setAlpha(1);
        someObject.beta = 2;
        someObject.gamma = 3;

        System.out.println("Alpha is: " + someObject.getAlpha());
        System.out.println("Beta is: " + someObject.beta);
        System.out.println("Gamma is: " + someObject.gamma);
    }
}
