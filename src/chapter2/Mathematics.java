package chapter2;

public class Mathematics {
    public static void main(String[] args) {
        int a = 10, b = 3;
        double c = 18.42, d = 19.78;

        System.out.printf("a + b = %d%n", a + b);
        System.out.printf("a - b = %d%n", a - b);
        System.out.printf("a / b = %d%n", a / b);
        System.out.printf("c / d = %.2f%n", c / d);
        System.out.printf("a * b = %d%n", a * b);
        System.out.printf("c * d = %.2f%n", c * d);
        System.out.println("a % b = " + (a % b));
        System.out.println("d % c = " + (d % c));
        System.out.printf("++a = %d%n", ++a);
        System.out.printf("--b = %d%n", --b);
        System.out.printf("a++ - ++a = %d, -> a = ", (a++ - ++a));
        System.out.println(a);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1 & bool2);
        System.out.println(bool1 | bool2);
        System.out.println(!(bool1 & bool2));
        System.out.println(bool1 ^ bool2);

        c = d = 3.14;

        System.out.println(c);
        System.out.println(d);
    }
}


// Математически оператори
// + събиране
// - изваждане
// * умножение
// / деление
// ++ оператор за инкрементация (увеличение с еденица)
// -- оператор за декрементация (намаление с еденица)


// Оператори за сравнение
// < по-малко
// > по-голямо
// <= по-малко или равно
// >= по-голямо или равно
// == равно
// != не е равно


// Логически оператори
// && И
// || ИЛИ
// ^ изключващо ИЛИ
// ! НЕ
// & И
// | ИЛИ


// = присвояване
// += присвояване със събиране
// -= присвояване с изваждане
// *= присвояване с умножение
// /= присвояване с деление
