package chapter14.changeTheString;

import java.util.Scanner;

public class LambdaArgument {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringFunction reverse = (s) -> {
            StringBuilder result = new StringBuilder();

            for (int a = s.length() - 1; a >= 0; a--) {
                result.append(s.charAt(a));
            }

            return result.toString();
        };

        StringFunction invert = (s) -> {
            StringBuilder result = new StringBuilder();

            for (int b = 0; b < s.length(); b++) {
                char letter = s.charAt(b);
                if(Character.isLowerCase(letter)){
                    result.append(Character.toUpperCase(letter));
                }
                else{
                    result.append(Character.toLowerCase(letter));
                }
            }

            return result.toString();
        };

        System.out.println("Enter an expression:");
        String expression = input.nextLine();
        System.out.println(changeString(reverse, expression));

        System.out.println("\nEnter the second expression:");
        expression = input.nextLine();
        System.out.println(changeString(s -> s.replace(" ", "-"), expression));

        System.out.println("\nEnter the third expression:");
        expression = input.nextLine();
        System.out.println(changeString(invert, expression));
    }

    private static String changeString(StringFunction sf, String str){
        return sf.function(str);
    }
}



//Tests

//Madam in Eden I’m Adam

//A man a plan a canal Panama

//Satisfaction lies in the effort, not in the attainment, full effort is full victory. [Mahatma Gandhi]

//Live as if you were to die tomorrow. Learn as if you were to live forever. [Mahatma Gandhi]

//Knowing yourself is the beginning of all wisdom. [Aristotle]

//Happiness depends upon ourselves. [Aristotle]
