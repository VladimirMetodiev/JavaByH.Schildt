package chapter2;

public class Cast {
    public static void main(String[] args) {
        // Неявно преобразуване
        byte theFirst = 100;
        short theSecond = theFirst;
        int theThird = theSecond;
        long theFourth = theThird;
        double theFifth = theFourth;

        System.out.println(theFifth);

        // Явно преобразуване
        theFourth = (long)theFifth;
        theThird = (int)theFourth;
        theSecond = (short)theThird;
        theFirst = (byte)theSecond;

        System.out.println(theFirst);

        char letter = (char)theFirst;

        System.out.println(letter);
    }
}
