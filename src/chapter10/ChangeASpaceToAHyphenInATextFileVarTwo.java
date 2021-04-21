package chapter10;

import java.io.*;

public class ChangeASpaceToAHyphenInATextFileVarTwo {
    public static void main(String[] args) {
        int symbol;

        try(BufferedReader br = new BufferedReader(new FileReader("text\\ShowText.txt")); BufferedWriter bw = new BufferedWriter(new FileWriter("text\\SpaceToHyphenVarTwo.txt", true))){
            while ((symbol = br.read()) != -1){
                if(symbol == 32) symbol = 45;
                bw.write(symbol);
            }
        }
        catch (FileNotFoundException ex1){
            System.out.println("No such file!");
        }
        catch (IOException ex2){
            System.out.println("I/O Exception: " + ex2.getMessage());
        }
    }
}
