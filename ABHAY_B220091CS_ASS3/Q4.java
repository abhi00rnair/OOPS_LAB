
import java.util.Scanner;

class book{
    String title;
    String author;
    double price;
    int year;
    book(String title,String author,double price,int year){
        this.title=title;
        this.author=author;
        this.price=price;
        this.year=year;
    }
    void displaydetail(){
        System.out.println("title :"+this.title);
        System.out.println("Authot :"+this.author);
        System.out.println("price: $"+this.price);
        System.out.println("Year published:"+this.year);
    }
}
public class Q4{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("enter details to add");
            String title=scan.nextLine();
            String author=scan.nextLine();
            double price=scan.nextDouble();
            int year=scan.nextInt();
            scan.nextLine();
            book book1=new book(title,author,price,year);
            book1.displaydetail();
        }
    }
}