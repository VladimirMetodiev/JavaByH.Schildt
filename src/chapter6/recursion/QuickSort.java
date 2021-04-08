package chapter6.recursion;

public class QuickSort {
    public static void quickSort(char[] myArray, int left, int right) {
        int a, z;
        char letter, current;

        a = left;
        z = right;
        letter = myArray[(left + right) / 2];

        do {
            while ((myArray[a] < letter) && (a < right)) a++;   // ако условието е изпълнено увеличаваме индекса "а" с 1
            while ((letter < myArray[z]) && (z > left)) z--;    // ако условието е изпълнено намаляваме индекса "z" с 1

            if (a <= z) {
                current = myArray[a];
                myArray[a] = myArray[z];
                myArray[z] = current;
                a++;
                z--;
            }
        } while (a <= z);

        if (left < z) quickSort(myArray, left, z);
        if (a < right) quickSort(myArray, a, right);
    }
}
