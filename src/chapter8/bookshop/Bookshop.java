package chapter8.bookshop;

import java.util.Scanner;

public class Bookshop {
    protected static String command;
    protected static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            printMessage();
            command = input.nextLine().toLowerCase();
            if(command.equals("end")){
                break;
            }

            switch (command){
                case "add a book": add(); break;
                case "book info": getBookInfo(); break;
                case "inventory": inventory(); break;
                case "buy": buy(); break;
                case "change price": change(); break;
                default: System.out.println("Wrong command!"); break;
            }
        }
    }

    private static void printMessage(){
        System.out.println("Choose: \"end\", \"add a book\", \"book info\", \"inventory\", \"buy\" or \"change price\"");
    }

    protected static void add(){
        System.out.println("Enter title:");
        String title = input.nextLine();
        System.out.println("Enter author:");
        String author = input.nextLine();
        System.out.println("Enter year of publication:");
        int date = Integer.parseInt(input.nextLine());
        System.out.println("Enter count:");
        int count = Integer.parseInt(input.nextLine());
        System.out.println("Enter price:");
        double price = Double.parseDouble(input.nextLine());
        BookStorage newBook = new BookStorage(title, author, date, count, price);
        BookStorage.storage.add(newBook);
    }

    protected static void inventory() {
        for (int a = 1; a < BookStorage.storage.size(); a++) {
            System.out.printf("ID: %d | %s, %s - %d [%3d]%n",
                    a,
                    BookStorage.storage.get(a).getCurrentTitle().toUpperCase(),
                    BookStorage.storage.get(a).getCurrentAuthor(),
                    BookStorage.storage.get(a).getDate(),
                    BookStorage.storage.get(a).getCount()
            );
        }
        System.out.println();
    }

    protected static void getBookInfo(){
        System.out.println("Choose: for \"search by surname\" - [S] or for\"search by title\" - [T]");
        switch (input.nextLine().toUpperCase()){
            case "S": searchSurname(); break;
            case "T":  searchTitle(); break;
            default: System.out.println("Wrong command!"); break;
        }
    }

    protected static void searchSurname(){
        System.out.println("Enter the author's surname:");
        String surname = input.nextLine();
        for (int a = 1; a < BookStorage.storage.size(); a++) {
            if(surname.equals(BookStorage.storage.get(a).getCurrentAuthor().substring(BookStorage.storage.get(a).getCurrentAuthor().lastIndexOf(" ") + 1))){
                System.out.println("ID: " + a);
                BookStorage.storage.get(a).display();
            }
        }
    }

    protected static void searchTitle(){
        System.out.println("Enter the title:");
        String surname = input.nextLine();
        for (int a = 1; a < BookStorage.storage.size(); a++) {
            if(surname.equalsIgnoreCase(BookStorage.storage.get(a).getCurrentTitle())){
                System.out.println("ID: " + a);
                BookStorage.storage.get(a).display();
            }
        }
    }

    protected static void buy(){
        System.out.println("Enter ID:");
        int id = Integer.parseInt(input.nextLine());
        if(id > 0 && id < BookStorage.storage.size()) {
            if (BookStorage.storage.get(id).getCount() > 0) {
                BookStorage.storage.get(id).setCount(BookStorage.storage.get(id).getCount() - 1);
                System.out.println("The book was sold.");
            }
            else {
                System.out.println("The book is not available.");
            }
        }
        else{
            System.out.println("There isn't such ID.");
        }
    }

    protected static void change(){
        System.out.println("Enter ID:");
        int id = Integer.parseInt(input.nextLine());
        if(id > 0 && id < BookStorage.storage.size()) {
            System.out.println("Enter a new price:");
            BookStorage.storage.get(id).setPrice(Double.parseDouble(input.nextLine()));
            System.out.println("The price was changed.");
        }
        else{
            System.out.println("There isn't such ID.");
        }
    }
}



//Test information

//SQL: The Complete Reference
//James Groff, Paul Weinberg, Andrew Oppel
//2015
//20
//78.6

//Modern Java Recipes
//Ken Kousen
//2018
//14
//29.89
