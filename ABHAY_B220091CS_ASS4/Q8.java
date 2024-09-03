import java.util.ArrayList;
class Book {
    private String title;
    private String author;
    private int year;j
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}


class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

 
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}
public class Q8{
    public static void main(String[] args) {
        Book b1=new Book("clrs","unknown",1999);
        Book b2=new Book("b22","director",2023);
        Library l1=new Library();
        l1.addBook(b2);
        l1.addBook(b1);
        l1.displayBooks();
        l1.removeBook(b2);
        l1.displayBooks();
    }
}
