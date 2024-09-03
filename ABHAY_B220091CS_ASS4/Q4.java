
import java.util.ArrayList;
import java.util.List;

class Library{
    List<Book>arr;
    Library(){
        arr=new ArrayList<Book>();
    }
    void addbook(Book b1){
        arr.add(b1);
    }
    void displaybook(){
        for(Book it:arr){
            System.out.println(it);
        }
    }
}
class Book{
    String title;
    String isbn;
    Author author;
    Book(String title,String isbn, Author a1){
        this.title=title;
        this.isbn=isbn;
        this.author=a1;
    }
    String gettitle(){
        return title;
    }
    String getisbn(){
        return isbn;
    }
    void dispalybook(){
        System.out.println(title + isbn + author);
    }
}
class Author{
    String name;
    String nation;
    Author(String name,String nation){
        this.name=name;
        this.nation=nation;
    }
    String getname(){
        return name;
    }
    String getnation(){
        return nation;
    }
    void dispalybook(){
        System.out.println(name + nation);
    }
}
public class Q4{
    public static void main(String[] args) {
        
    }
}

