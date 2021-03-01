package chapter2;

public class BasicTypes {
    public static void main(String[] args) {
        // ЦЕЛОЧИСЛЕНИ ТИПОВЕ ЧИСЛА

        // 8-bits == 1 byte. ----------------------------------------------------------------------------
        // Цяло число със знак: Диапазон от -128 до +127.
        byte a = -128;
        byte b = +127;

        // 16-bits == 2 bytes. -------------------------------------------------------------------------
        // Цяло число със знак: Диапазон от -32768 до +32767.
        short c = -32768;
        short d = +32767;


        // 32-bits = 4 bytes. ---------------------------------------------------------------------------
        // Цяло число със знак: Диапазон от -2147483648 до +2147483647.
        int e = -2147483648;
        int f = +2147483647;


        // 64-bits = 8 bytes. ---------------------------------------------------------------------------
        // Цяло число със знак: Диапазон от -9223372036854775808 до +9223372036854775807.
        long g = -9223372036854775808L;
        long h = +9223372036854775807L;

        // Бележка: в Java, всички числови-типове, имат както положително, така и отрицателно значение

        // ЧИСЛА С ПЛАВАЩА ТОЧКА

        // Служат за представяна на дробни числа

        // 32-bits = 4 bytes. ---------------------------------------------------------------------------
        // Число с единична точност, с плаваща точка, със знак: Диапазон от +/-1.5 x 10^-45 до +/-3.4 x 10^38.
        float i = -0.123456789f;
        float j = +1.123456789F;


        // 64-bits = 8 bytes. ---------------------------------------------------------------------------
        // Число с двойна точност, с плаваща точка, със знак: Диапазон от +/-5.0 x 10^-324 до +/-1.7 x 10^308.
        double k = -0.123456789d;
        double l = +1.123456789;

        // ЛОГИЧЕСКИ ТИП

        // 8-bits == 1 byte. ----------------------------------------------------------------------------
        // Стойности: true или false
        boolean m = true;
        boolean n = false;

        // СИМВОЛЕН ТИП

        // 16-bits == 2 bytes. -------------------------------------------------------------------------
        // Символ във формат UNICODE.
        char o = 'a';
        char p = 'A';

        // ТИП СИМВОЛЕН НИЗ

        // Символен низ във формат UNICODE.
        String q = "java programming";
        String r = "JAVA PROGRAMMING";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
