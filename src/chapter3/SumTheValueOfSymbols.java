package chapter3;

import java.io.IOException;

public class SumTheValueOfSymbols {
    public static void main(String[] args) throws IOException {
        char letter;
        int sum = 0, counter = 0;

        while ((letter = (char)System.in.read()) != '.'){
            if(letter == 10) {
                counter++;
                continue;
            }
            sum += letter;
        }

        System.out.println("The sum is: " + sum);
        if(counter > 1) System.out.println("The spaces are: " + counter);
        else System.out.println("The space is: " + counter);
    }
}



//Tests

//G
//p
//q
//M
//c
//T
//.
//The sum is: 556
//The spaces are: 6

//A
//.
//The sum is: 65
//The space is: 1
