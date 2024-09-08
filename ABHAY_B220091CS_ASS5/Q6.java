interface Borrowable {
    void checkIn(String user);  
    void checkOut();            
}

abstract class Book implements Borrowable {
    protected int bookID;
    protected String title;
    protected String author;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    public abstract void checkIn(String user);
    public abstract void checkOut();
    
    public void displayDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class TextBooks extends Book {
    private String status;
    private String borrowedUser;

    public TextBooks(int bookID, String title, String author) {
        super(bookID, title, author);
        this.status = "Available";  
        this.borrowedUser = null;
    }

    @Override
    public void checkIn(String user) {
        if (status.equals("Available")) {
            status = "Borrowed";
            borrowedUser = user;
            System.out.println("Book borrowed by: " + user);
        } else {
            System.out.println("Book is already borrowed by: " + borrowedUser);
        }
    }

    @Override
    public void checkOut() {
        if (status.equals("Borrowed")) {
            status = "Available";
            borrowedUser = null;
            System.out.println("Book returned and now available.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Status: " + status);
        if (borrowedUser != null) {
            System.out.println("Borrowed by: " + borrowedUser);
        }
    }
}

class ReferenceBooks extends Book {

    public ReferenceBooks(int bookID, String title, String author) {
        super(bookID, title, author);
    }

    @Override
    public void checkIn(String user) {
        System.out.println("Invalid");
    }

    @Override
    public void checkOut() {
        System.out.println("Cannot be borrowed");
    }
}

public class Q6{
    public static void main(String[] args) {
        TextBooks textbook = new TextBooks(101, "Java Programming", "James Gosling");
        textbook.displayDetails();
        textbook.checkIn("Alice");  
        textbook.displayDetails();
        textbook.checkOut();        
        textbook.displayDetails();
        
        System.out.println();

        ReferenceBooks referenceBook = new ReferenceBooks(102, "Encyclopedia", "Britannica");
        referenceBook.displayDetails();
        referenceBook.checkIn("Bob");  
        referenceBook.checkOut();  
    }
}
