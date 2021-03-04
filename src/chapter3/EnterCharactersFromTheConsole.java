package chapter3;

public class EnterCharactersFromTheConsole {
    public static void main(String args[]) throws java.io.IOException {
        System.out.println("The interesting program!");

        System.out.println("Enter the number of letters in the word:");
        char symbol = (char)System.in.read();
        int number = Integer.parseInt("" + symbol);

        StringBuilder word = new StringBuilder();

        System.out.println("Press a key followed by Enter: ");

        for(int a = 0; a < 2 * number; a++){
            char letter = (char)System.in.read();       // Преди всеки нов символ, има нов ред
            if(letter != 10) word.append(letter);
        }

        System.out.println(word);
    }
}



// методът .read()
// Чете следващия байт-данни от входящият поток. Стойността на този байт се връща като int в диапазона от 0 до 255.
// Ако няма повече входящи байтове, тъй като е достигнат краят на потока, методът връща стойността: -1.
// Този метод блокира, докато не бъдат налични входящи данни, или докато не бъде открит краят на потока, или докато не бъде изведено изключение.



// Tests

//4
//w
//o
//r
//d


//8
//e
//x
//e
//r
//c
//i
//s
//e



// Solution

//    public static void main(String args[]) throws java.io.IOException {
//        System.out.println("The boring program!");
//
//        char letter;
//
//        System.out.print("Press a key followed by ENTER: ");
//
//        letter = (char) System.in.read(); // get a char
//
//        System.out.println("Your key is: " + letter);
//    }

