package chapter14.stringTest;

import java.util.Scanner;

public class StartStrTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first = input.nextLine();
        String second = input.nextLine();

        //StringTest test = (a, b) -> a.indexOf(b) != -1;
        StringTest test = (a, b) -> a.contains(b);

        if (test.strTest(first, second)) {
            System.out.println("The first string contains the second.");
        }
        else {
            System.out.println("The first string doesn't contain the second.");
        }
    }
}



//Tests

//Success usually comes to those who are too busy to be looking for it.
//busy to be looking for it

//Opportunities don't happen. You create them.
//I find that the harder I work, the more luck I seem to have. (Thomas Jefferson)

//The ones who are crazy enough to think they can change the world, are the ones that do.
//The ones who are crazy enough to think they can change the world, are the ones that do.
