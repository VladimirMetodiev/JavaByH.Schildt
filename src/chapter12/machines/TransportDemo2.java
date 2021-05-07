package chapter12.machines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TransportDemo2 {
    public static void main(String[] arguments) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().trim().toUpperCase();

        // Методът valueOf() връща константа от изброимият тип, чиято стойност съответства на низът, предаден на метода като аргумент;
        Transport vehicle = Transport.valueOf(str);
        System.out.println(vehicle + "\n");

        // Методът values() връща масив, съдържащ списък с константите на изброимият тип;
        Transport[] vehicles = Transport.values();
        for(Transport item : Transport.values()){
            System.out.printf("[%d] %s%n", (item.ordinal() + 1), item);
        }

        reader.close();
    }
}
