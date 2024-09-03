import java.util.*;

public class Q11{
    HashSet<Integer>arr=new HashSet<>();
    Scanner my=new Scanner(System.in);
    public static void main(String [] args){
        Q11 employeemanager=new Q11();
        employeemanager.run();
    }
    public void run(){
        while(true){
            System.out.println("select the operation");
            int option=my.nextInt();
            switch(option){
                case 1:
                    addid();
                    break;
                case 2:
                    removeid();
                    break;
                case 3:
                    displayid();
                    break;
                case 4:
                    exit();
                    return;
            }
        }
    }
    public void addid(){
        System.out.println("enter id to add");
        int id=my.nextInt();
        arr.add(id);
    }
    public void removeid(){
        System.out.println("enter id to remove");
        int id=my.nextInt();
        arr.remove(id);
    }
    public void displayid(){
        System.out.println("ids are");
        Iterator <Integer> it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void exit(){
        System.out.println("exited successfully");
        
    }
}
