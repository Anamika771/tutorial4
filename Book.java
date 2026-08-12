package module2;

public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Book b1 = new Book("The Alchemist", "Paulo Coelho", 350);
        Book b2 = new Book("Wings of Fire", "A. P. J. Abdul Kalam", 450);

        System.out.println("Book 1 Details:");
        b1.displayBook();

        System.out.println("\nBook 2 Details:");
        b2.displayBook();
    }
}