package chapter14.throwingAnException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class LambdaExceptionDemo {
    public static void main(String[] args) throws IOException{

        MyIOAction myIO = (reader) ->  {
            StringBuilder sb = new StringBuilder();
            int current;

            while((current = reader.read()) != -1) {
                sb.append((char)current);
            }

            return sb.toString();
        };

        String path = "src\\chapter14\\throwingAnException\\ProfitDefinition.txt";
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(path);
            System.out.println("The text in the file is:\n" + myIO.ioAction(fis));
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if(fis != null) fis.close();
        }

    }
}
