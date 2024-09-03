
import java.util.Scanner;

public class Q7{
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int a=my.nextInt();
        int b=my.nextInt();
        my.nextLine();
            char temp=my.nextLine().charAt(0);
            switch(temp){
                case 'a':
                 System.out.println(a+b);
                 break; 

                 case 'b':
                    System.out.println(a-b);
                    break;
                case 'c':
                    System.out.println(a/b);
                    break;

                case 'd':
                    System.out.println(a*b);
                    break;        
            }
        }

        }