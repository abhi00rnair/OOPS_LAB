
import java.util.Scanner;

public class Q8{
    public static void main(String [] args){
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int m=my.nextInt();
        int [][]A=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=my.nextInt();
            }
        }
        int [][] B=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                B[j][i]=A[i][j];
            }
        }


    }
}