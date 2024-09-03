
import java.util.Scanner;

public class Q5{
    public static void main(String[]args){
        Scanner my=new Scanner(System.in);
        System.out.println("enter string to reverse");
        String s=my.nextLine();
        char arr[]=s.toCharArray();
        char ret[]=new char[s.length()];
        func(arr,s,arr.length-1,ret,0);
        String rett=new String(ret);
        System.out.println(rett);


    }
    public static void func(char arr[],String s,int i,char ret[],int j){
        if(i<0){
            return;
        }
        ret[j]=arr[i];
        func(arr,s,i-1,ret,j+1);
    }
}