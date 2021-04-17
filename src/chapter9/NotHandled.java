package chapter9;

import java.util.ArrayList;
import java.util.Arrays;

public class NotHandled {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        list.get(15);
    }
}




