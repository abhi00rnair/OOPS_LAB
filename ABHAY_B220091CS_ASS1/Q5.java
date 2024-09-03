
import java.util.Scanner;


public class Q5{
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        String s=my.nextLine();
        String temp=func(s);
        System.out.println(temp);
    }
    public static String func(String s){
        String ret="";
        for(int i=s.length()-1;i>=0;i--){
            ret+=s.charAt(i);
        }
        return ret;
    }
}