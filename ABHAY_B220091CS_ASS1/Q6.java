
import java.util.ArrayList;
import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
        Scanner my =new Scanner(System.in);
        int n=my.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        func(n,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+ " ");
        }
    }
    public static void func(int n,ArrayList<Integer>arr){
        arr.add(1);
        arr.add(1);
        for(int i=2;i<n;i++){
            int element=arr.get(i-1)+arr.get(i-2);
            arr.add(element);
        }
    }
}