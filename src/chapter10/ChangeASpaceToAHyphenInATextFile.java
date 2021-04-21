package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ChangeASpaceToAHyphenInATextFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int symbol;

        try{
            fis = new FileInputStream("text\\ShowText.txt");
            fos = new FileOutputStream("text\\SpaceToHyphen.txt", true);

            while ((symbol = fis.read()) != -1){
                if(symbol == 32) symbol = 45;
                fos.write(symbol);
            }
        }
        catch (FileNotFoundException ex1){
            System.out.println("No such file!");
        }
        catch (IOException ex2){
            System.out.println("I/O Exception: " + ex2.getMessage());
        }
        finally {
            try{
                if(fis != null) fis.close();
            }
            catch (IOException ex3){
                System.out.println("I/O Exception: " + ex3.getMessage());
            }

            try{
                if(fos != null) fos.close();
            }
            catch (IOException ex4){
                System.out.println("I/O Exception: " + ex4.getMessage());
            }
        }
    }
}
