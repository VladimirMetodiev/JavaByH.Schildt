package chapter9;

import java.util.Arrays;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        String[] stars = new String[10];
        Arrays.fill(stars, "*");

        try {
            System.out.println("Generate an index out-of-bounds exception.");
            setPlus(stars);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught the exception: Array index out-of-bounds!");
        }

        System.out.println(Arrays.toString(stars));
    }

    static void setPlus(String[] arr){
        arr[100] = "+";
    }
}
