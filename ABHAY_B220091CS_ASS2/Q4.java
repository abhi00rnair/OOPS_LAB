import java.util.ArrayList;
import java.util.Scanner;

public class Q4{
    public static void main(String [] args ){
        Scanner my = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=my.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            int temp=my.nextInt();
            arr.add(temp);
        }
        my.close();
        int []max={Integer.MIN_VALUE};
        func(arr,0,max,n-1);
        System.out.println("Maximum value is"+" " +max[0]);
    }
    public static void func(ArrayList<Integer>arr, int i, int []max, int n){
        if(i>n){
            return;
        }
        if(arr.get(i)>max[0]){
            max[0]=arr.get(i);
        }
        func(arr,i+1,max,n);
    }
}
