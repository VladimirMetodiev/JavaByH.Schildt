package chapter6.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of letters:");
        int number = Integer.parseInt(input.nextLine());

        char[] letters = new char[number];

        System.out.println("Enter some letters:");
        for (int a = 0; a < number; a++) {
            letters[a] = input.next().charAt(0);
        }

        QuickSort.quickSort(letters, 0, letters.length - 1);

        System.out.println(Arrays.toString(letters));
    }
}



//Test

//10
//c w b m g x e c k y

//14
//H o f m A J k S p J r T h u

//6
//a b a b a b

//9
//m p p p t a n q j

//2
//z a
