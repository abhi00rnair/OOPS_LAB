
import java.util.Scanner;

public class Q1{
    public static void main(String args[]){
        Scanner My=new Scanner(System.in);
        System.out.println("enter a integer");
        int n=My.nextInt();
        int out=1;
        for(int i=2;i<=n;i++){
            out*=i;
        }
        System.out.println(out);
    }
}