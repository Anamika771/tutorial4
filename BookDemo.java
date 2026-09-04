package tutorial8;

class Book {
    String title;
    String author;

    void display() {
        System.out.println("Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Book {
    String subject;

    @Override
    void display() {
        System.out.println("Technical Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    @Override
    void display() {
        System.out.println("Story Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Genre: " + genre);
    }
}

public class BookDemo {

    public static void main(String[] args) {

        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "James Gosling";

        Book b2 = new Technical();
        b2.title = "Java Programming";
        b2.author = "Herbert Schildt";
        ((Technical) b2).subject = "Programming";

        Book b3 = new Story();
        b3.title = "The Alchemist";
        b3.author = "Paulo Coelho";
        ((Story) b3).subject = "Fiction";
        ((Story) b3).genre = "Adventure";

        b1.display();

        System.out.println();

        b2.display();

        System.out.println();

        b3.display();
    }
}
