package chapter10;

import java.io.*;

public class BufferedWriterClass {
    public static void main(String[] args) {
        String temporary;

        try(BufferedReader br = new BufferedReader(new FileReader("text\\HerringGull.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("text\\CopyOfHerringGull.txt"))) {

            while ((temporary = br.readLine()) != null){
                bw.write(temporary);
                bw.newLine();           // Поставям нов ред
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
