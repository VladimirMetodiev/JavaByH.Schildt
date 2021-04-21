package chapter10;

import java.io.*;

public class FileWriterClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;
        String line;

        System.out.println("To finish write: \"stop typing\"");

        try{
            writer = new FileWriter("text\\Words.txt", true);

            while(!(line = reader.readLine()).equals("stop typing")){
                writer.write(line + "\n");
            }
        }
        finally {
            if(writer != null) writer.close();
        }

        System.out.println("\nRecorded words:");

        BufferedReader reader2 = new BufferedReader(new FileReader("text\\Words.txt"));

        while((line = reader2.readLine()) != null){
            System.out.println(line);
        }

        reader.close();
        reader2.close();
    }
}



//Test

//punctuation
//stress mark
//apostrophe
//comma
//semicolon
//colon
//question mark
//exclamation mark
//quotation marks
//inverted commas
//parenthesis
//hyphen
//stop typing
