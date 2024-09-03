
import java.util.Scanner;

public class Q1{
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Q1 q1=new Q1();
        q1.run();
    }
    public void run(){
        System.out.println("enter the operator");
        char temp=scan.next().charAt(0);
        try{
        int i =scan.nextInt();
        int j=scan.nextInt();
        switch(temp){
            case'+':
            int res1=add(i,j);
            System.out.println("output is "+res1);
            break;

            case '-':
            int res2=sub(i,j);
            System.out.println("result is "+ res2);
            break;

            case '*':
            int res3=multi(i,j);
            System.out.println("result is "+res3);
            break;

            case '/':
            int res4=divi(i,j);
            System.out.println("result is "+res4);
            break;

            default:
                System.out.println("enter a valid operator");
        }

    }catch(Exception e){
        System.out.println("enter a valid integer");
    }

    }
    int add(int i, int j){
        return i+j;
    }
    int sub(int i,int j){
        return i-j;
    }
    int multi(int i, int j){
        return i*j;
    }
    int divi(int i, int j){
        try {
            return i/j;
        } catch (ArithmeticException e) {
            System.out.println("arithemetic exception division by zero handled. enetr a valid argument");
        }
        return Integer.MIN_VALUE;
    }
    }
