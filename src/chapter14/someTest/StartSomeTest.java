package chapter14.someTest;

import java.util.Scanner;

public class StartSomeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int x = input.nextInt();
        int y = input.nextInt();
        input.nextLine();

        GenericInterface<Integer> isFactor = (a, b) -> (a % b) == 0;
        System.out.println(isFactor.test(x, y));

        GenericInterface<String> compares = (c, d) -> c.indexOf(d) == 0;
        //GenericInterface<String> compares = (c, d) -> c.equals(d);

        System.out.println("Enter two words:");
        String word = input.next();
        String vocable = input.next();
        input.nextLine();

        System.out.println(compares.test(word, vocable));

        System.out.println("Enter two words:");
        word = input.next();
        vocable = input.next();
        input.nextLine();

        System.out.println(compares.test(word, vocable));
    }


}



//Test

//Input
//10
//2
//SUCCESS
//WORK
//air
//air

//Output
//true
//false
//true
