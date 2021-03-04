package chapter3;

import java.util.Scanner;

public class TrickySum {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int theFirst = getNumber();
        int theSecond = getNumber();

        long sum = 0L;
        int a = (theFirst <= theSecond) ? theFirst : theSecond;
        int b = (theFirst <= theSecond) ? theSecond : theFirst;

        for(int i = a; i <= b; sum += i++);

        System.out.println("The sum is: " + sum);
    }

    private static int getNumber(){
        System.out.println("Enter a number:");
        return Integer.parseInt(input.nextLine());
    }
}



//Tests

//Input
//1
//5
//Output
//15

//Input
//1
//543892
//Output
//147909525778

//Input
//-153429
//8372614
//Output
//35038566477070
