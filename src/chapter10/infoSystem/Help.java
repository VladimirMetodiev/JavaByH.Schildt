package chapter10.infoSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Help {
    String helpFile;

    Help(String helpFile) {
        this.helpFile = helpFile;
    }

    boolean helpOn(String what) {
        int symbol;
        String topic, info;

        try (BufferedReader reader = new BufferedReader(new FileReader(helpFile))) {
            do {
                // read characters until a # is found
                symbol = reader.read();

                if(symbol == '#') {
                    topic = reader.readLine();
                    if(what.compareTo(topic) == 0) {
                        do {
                            info = reader.readLine();
                            if(info != null) System.out.println(info);
                        } while((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while(symbol != -1);
        }
        catch(IOException exc) {
            System.out.println("Error accessing help file.");
            return false;
        }
        return false;
    }

    String getSelection() {
        String topic = "";

        BufferedReader streamReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter topic: ");
        try {
            topic = streamReader.readLine();
        }
        catch(IOException ex) {
            System.out.println("Error reading console.");
        }

        return topic;
    }
}
