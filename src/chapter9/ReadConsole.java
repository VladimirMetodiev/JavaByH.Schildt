package chapter9;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
    public static void main(String[] args) throws IOException {
        StringBuilder expression = new StringBuilder();
        InputStreamReader isr = null;
        char letter;

        try{
            isr = new InputStreamReader(System.in);

            System.out.println("Enter '*' to quit.");

            while ((letter = (char) isr.read()) != '*'){
                expression.append(letter);
            }

        }
        finally {
            if(isr != null) isr.close();
        }

        System.out.println(expression);
    }
}



//Test

//We have put together a list of home learning activities to help students, teachers, families and adults to learn about the economy.
