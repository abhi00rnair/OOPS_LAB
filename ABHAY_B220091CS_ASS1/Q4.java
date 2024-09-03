
import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner My=new Scanner(System.in);
        String s=My.nextLine();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
             if(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U' ||c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                System.out.println("vowel is present");
                flag=1;
                break;
            }

        }
        if(flag==0){
            System.out.println("vowel not present");
        }
    }
}