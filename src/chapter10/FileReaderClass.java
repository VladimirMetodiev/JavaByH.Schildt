package chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) {
        String temporary;

        try (BufferedReader br = new BufferedReader(new FileReader("text\\Words.txt"))) {
            while((temporary = br.readLine()) != null) {
                System.out.println(temporary);
            }
        }
        catch(IOException ex1) {
            System.out.println("I/O Exception: " + ex1);
        }
    }
}
