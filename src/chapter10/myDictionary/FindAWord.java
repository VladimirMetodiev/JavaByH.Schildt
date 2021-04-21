package chapter10.myDictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAWord {
    public static void main(String[] args) throws IOException {
        Dictionary myGlossary = new Dictionary("text\\Glossary.txt");
        String expression;

        BufferedReader streamReader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            getMessage();

            expression = streamReader.readLine();
            if(expression.equalsIgnoreCase("end to the search")) break;

            if(!myGlossary.search(expression)) {
                System.out.println("The word not found.\n");
            }
        }
    }

    private static void getMessage(){
        int counter = 0;

        System.out.println("Choose a word or type \"end to the search\":");

        putALine();
        for(String element : Dictionary.words){
            System.out.printf("%-19s", element);
            if(++counter == 8){
                System.out.println();
                counter = 0;
            }
        }

        System.out.println();
        putALine();
    }

    private static void putALine(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
