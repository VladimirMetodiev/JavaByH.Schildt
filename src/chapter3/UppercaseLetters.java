package chapter3;

import java.io.IOException;
import java.util.ArrayList;

public class UppercaseLetters {
    public static void main(String[] args) throws IOException {
        char letter;
        int counter = 0;
        ArrayList<Character> list = new ArrayList<>();

        while ((letter = (char)System.in.read()) != '.'){
            if(letter == 10) {
                continue;
            }
            counter++;
            if(letter >= 'A' & letter <= 'Z') {
                list.add(letter);
            }
            else {
                list.add((char)(letter - 32));
            }
        }

        list.forEach(e -> System.out.print(e + " "));
        System.out.println();

        if(counter > 1) System.out.println("The letters are: " + counter);
        else System.out.println("Only one letter!");
    }
}



//Test

//o
//c
//s
//m
//f
//.
//O C S M F
//The letters are: 5


//v
//I
//c
//t
//O
//R
//y
//.
//V I C T O R Y
//The letters are: 7


//D
//.
//D
//Only one letter!
