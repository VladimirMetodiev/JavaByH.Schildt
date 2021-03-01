package chapter2;

public class AboutByteAndShort {
    public static void main(String[] args) {
        byte a = 1;
        int b;

        a = (byte)(a + a);
        System.out.printf("a + a = %d%n", a);

        a = 9;
        b = a * a;              // No cast needed

        a = 9;
        a = (byte)(a * a);     // Cast needed !!!

        System.out.printf("a and b: %d and %d%n", a, b);

        short x;
        int y;

        x = 10;
        y = x * x;              // No cast needed

        x = 10;
        x = (short)(x * x);     // Cast needed !!!

        System.out.printf("x and y: %d and %d", x, y);
    }
}



// Типовете byte и short служат за съхранение на стойности.
// За да бъдат извършени математически операци, с byte или short стойности, те неявно се преобразуват към тип int.
