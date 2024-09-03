

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
    class book{
    int id;
    String title;
    String author;
    
    public void create(int id, String title, String author){
        this.id =id;
        this.title=title;
        this.author=author;
    }
    
}
    
public class Q10{
    ArrayList<book>arr=new ArrayList<>();
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args){
        Q10 libsystem=new Q10();
        libsystem.run();
    }
    public void run(){
        while(true){
            System.out.println("select an option");
            int temp=scan.nextInt();
            switch(temp){
                case 1:
                    addbook();
                    break;
                case 2:
                    removebook();
                    break;
                case 3:
                    listallbook();
                    break;
                case 4:
                    findbook();
                    break;
                case 5:
                    exit();
                    return;
                default:
                System.out.println("enter a valid option");
            }
            
        }
    }
        public void addbook(){
            System.out.println("enter the id, title, author");
            int id=scan.nextInt();
            String title=scan.nextLine();
            scan.nextLine();
            String author=scan.nextLine();
            book book1=new book();
            book1.create(id,title,author);
            arr.add(book1);
            
        }
        public void removebook(){
            System.out.println("enter the bok id");
            int id=scan.nextInt();
            Iterator<book> it=arr.iterator();
            while(it.hasNext()){
                book temp=it.next();
                if(temp.id==id){
                    it.remove();
                    return;
                }
            }
            
        }
        public void listallbook(){
            Iterator<book> it =arr.iterator();
            while(it.hasNext()){
                book temp=it.next();
                System.out.println(temp.title);
            }
        }
        
        public void findbook(){
            System.out.println("enter teh title of book to find");
            String temp=scan.nextLine();
            Iterator<book> it =arr.iterator();
            while(it.hasNext()){
                book tempp=it.next();
                if(tempp.title.equals(temp)){
                    System.out.println(tempp.id + tempp.title + tempp.author);
                    return;
                }
            }
        }
        public void exit(){
            System.out.println("exited successfully");
        }
        
    }
    
