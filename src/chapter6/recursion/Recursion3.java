package chapter6.recursion;

public class Recursion3 {
    private String text = null;

    Recursion3 (String text) {
        this.text = text;
    }

    String getText(){
        return this.text;
    }

    static void printInReverseOrder(Recursion3 obj, int length) {
        if (length >= 1) {
            System.out.print(obj.getText().charAt(length - 1));
            printInReverseOrder(obj, --length);
        }
    }
}



