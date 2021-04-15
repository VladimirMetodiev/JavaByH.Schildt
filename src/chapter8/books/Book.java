package chapter8.books;

public class Book {
    private String title;
    private String author;
    private int dateOfPublication;

    protected Book(String title, String author, int dateOfPublication) {
        this.title = title;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    protected void display() {
        System.out.println("Title: " + title);
        System.out.println("Author(s): " + author);
        System.out.println("Date of publication: " + dateOfPublication);
        System.out.println();
    }

    protected String getTitle(){
        return title;
    }

    protected String getAuthor(){
        return author;
    }

    protected int getDateOfPublication(){
        return dateOfPublication;
    }
}
