package chapter8.bookshop;

import chapter8.books.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class BookStorage extends Book{
    private int count = 0;
    private double price = 0.0;
    protected static ArrayList<BookStorage> storage = new ArrayList<>(Arrays.asList(
            new BookStorage("-", "-", 0, 0, 0.0),
            new BookStorage("Java: A Beginner's Guide", "Herbert Schildt", 2018, 15, 29.98),
            new BookStorage("Java: The Complete Reference", "Herbert Schildt", 2018, 8,68.8),
            new BookStorage("Effective Java", "Joshua Bloch", 2018, 12, 38.9),
            new BookStorage("Introducing JavaFX 8 Programming", "Herbert Schildt", 2015, 8, 24.75),
            new BookStorage("Big Java", "Cay Horstmann", 2019, 18, 36.8),
            new BookStorage("Java 8 Lambdas. Functional Programming for the Masses", "Richard Warburton", 2014, 0, 29.8),
            new BookStorage("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 2004, 2, 76.0)
        )
    );

    protected BookStorage(String title, String author, int dateOfPublication, int count, double price) {
        super(title, author, dateOfPublication);
        this.count = count;
        this.price = price;
    }

    @Override
    protected void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author(s): " + getAuthor());
        System.out.println("Date of publication: " + getDateOfPublication());
        System.out.println("Price: " + getPrice());
        System.out.printf("Item in stock: %s%n", getCount() > 0 ? "Yes" : "No");
        System.out.println();
    }

    protected int getCount() {
        return count;
    }

    protected void setCount(int count) {
        this.count = count;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected String getCurrentTitle(){
        return getTitle();
    }

    protected String getCurrentAuthor(){
        return getAuthor();
    }

    protected int getDate(){
        return getDateOfPublication();
    }
}
