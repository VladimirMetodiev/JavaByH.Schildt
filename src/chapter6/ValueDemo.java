package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class ValueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        printValues();
        printValues(1, 3, 9);
        printValues(Arrays.stream(input.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray());  //2, 15, 4, 34, 0, 8
    }

    private static void printValues(int ... value) {
        System.out.println("Number of arguments: " + value.length);
        System.out.println("Contents: ");

        for (int a = 0; a < value.length; a++) {
            System.out.printf(" -> argument %d: %d%n", a, value[a]);
        }

        System.out.println();
    }
}



// Метод с променлив брой параметри, се указва като в скобите му пишем <тип на променливите> ... <идентификатор>
// Аргументите на метод с променлив брой параметри, се обработват като масив, от съответният тип
// Списъкът с параметрите с променлива дължина може да се укаже само веднъж
// В метод с променлив брой параметри, могат да се укажат параметри с различен тип, но накрая трябва да бъде указан тип и идентификатор (на масива)

