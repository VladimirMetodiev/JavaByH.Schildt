package chapter16.someSwingList;

import javax.swing.*;
import java.util.Scanner;

public class StartList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = input.nextLine().split(",\\s+");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyList(names);
            }
        });
    }
}



//Tests

//Anna, Vladimir, Micheal, Daniel, Lora, Maria, Peter, Sarah, Alexander, Olga, Boris, Nina

//Sherry, John, Rachel, Sasha, Josselyn,  Randy, Tom, Mary, Ken, Andrew, Matt, Todd
