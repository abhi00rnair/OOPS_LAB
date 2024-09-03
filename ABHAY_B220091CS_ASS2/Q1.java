import java.util.*;

public class Q1{
    public boolean func(String s,int n,String ss){ 
        for(int i=0;i<s.length();i++){
            if(i+n<=s.length()){
                String temp=s.substring(i, i+n);
                if(temp.equals(ss)){
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String [] args){
        Scanner my =new Scanner (System.in);
        System.out.println("enter the string");
        String s=my.nextLine();
        System.out.println("enter the substring to find");
        String subtofind=my.nextLine();
        int n=subtofind.length();
        Q1 q=new Q1();
        boolean result =q.func(s,n,subtofind);
        System.out.println("return value is");
        System.out.println(result);
    }
}