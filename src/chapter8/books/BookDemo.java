package chapter8.books;

import java.util.ArrayList;

public class BookDemo {
    private static String title, author;
    private static int date;
    private static ArrayList<Book> bookList = new ArrayList<>();

    public static void main(String args[]) {
        bookList.add(new Book("-", "-", 0));
        bookList.add(new Book("Java: A Beginner's Guide", "Herbert Schildt", 2018));
        bookList.add(new Book("Java: The Complete Reference", "Herbert Schildt", 2018));
        bookList.add(new Book("Effective Java", "Joshua Bloch", 2018));
        bookList.add(new Book("Introducing JavaFX 8 Programming", "Herbert Schildt", 2015));
        bookList.add(new Book("Big Java", "Cay Horstmann", 2019));
        bookList.add(new Book("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 2004));

        String command;

        while (true){
            printMessage();
            command = MyScanner.input.nextLine().toLowerCase();
            if(command.equals("end")){
                break;
            }

            switch(command){
                case "add a book": add(); break;
                case "book info": getBookInfo(); break;
                case "catalogue": showCatalogue(); break;
                default: System.out.println("Wrong command!"); break;
            }
        }
    }

    private static void printMessage(){
        System.out.println("Choose: \"add a book\", \"book info\", \"catalogue\" or \"end\"");
    }

    private static void enter(){
        System.out.println("Enter title:");
        title = MyScanner.input.nextLine();
        System.out.println("Enter author:");
        author = MyScanner.input.nextLine();
        System.out.println("Enter year of publication:");
        date = Integer.parseInt(MyScanner.input.nextLine());
    }

    private static void add(){
        enter();
        Book current = new Book(title, author, date);
        bookList.add(current);
    }

    private static void getBookInfo(){
        System.out.println("Enter number of book:");
        int num = Integer.parseInt(MyScanner.input.nextLine());
        if(num > 0 && num < bookList.size()) bookList.get(num).display();
        else System.out.println("Wrong catalogue number!");
    }

    private static void showCatalogue(){
        for (int a = 1; a < bookList.size(); a++) {
            System.out.printf("[%d] %s%n", a, bookList.get(a).getTitle());
        }
        System.out.println();
    }
}



//Test

//Introduction to algorithms
//Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein
//2013
