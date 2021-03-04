package chapter3;

import java.util.Arrays;

public class ExtendedForLoop {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(array));

        for(int element : array){
            System.out.print(element + " ");
        }

        System.out.println("\n");

        char[] letters = {'J', 'a', 'v', 'a'};

        System.out.println(Arrays.toString(letters));

        for(char element : letters){
            System.out.print(element);
        }
    }
}



// Разширен for цикъл - for-each

// Принципна схема

// for(dataType item : array) {
//     code;
// }
