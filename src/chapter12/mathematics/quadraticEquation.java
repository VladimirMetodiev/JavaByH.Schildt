package chapter12.mathematics;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class quadraticEquation {
    public static void main(String args[]) {
        // Solve 4*x^2 + x - 3 = 0 for x.

        double a, b, c, x;

        a = 4;
        b = 1;
        c = -3;

        // Find first solution.
        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        // Find second solution.
        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
    }
}



/*
 * Java поддържа разширено използване на ключовата дума import. Като укажем static след ключова дума import,
 * можем да импортираме статичните членове на клас или интерфейс. Тази възможност осигурява механизма на статичното
 * импортиране. Статичното импортиране позволява да се обърнем към статичните членове с техните прости имена,
 * без да посочваме името на съответният клас, което опростява синтаксиса.
 *
 */