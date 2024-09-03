
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        for(int i=0;i<n;i++){
            int key=my.nextInt();
            arr.add(key);
        }
        Collections.sort(arr);
        int low=0;
        int high=n;
        int key=my.nextInt();
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)==key){
                System.out.println(mid);
                break;
            }else if(arr.get(mid)>key){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
    }
}