
import java.util.Scanner;

class individual{
    String name;
    String guest;
    String veg;
    int days;

    public int bill(String name,String guest, String veg, int days){
        int ret=0;
        if(veg.equals("yes")){
            ret+=(100*days);
        }else if(veg.equals("no")){
            ret+=(120*days);
        }
        if(guest.equals("yes")){
            ret+=((ret*10)/100);
        }
        return ret;
    }

}
public class Q6{
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        System.out.println("enter name");
        String name=my.nextLine();

        System.out.println("Are you a guest");
        String guest=my.nextLine();

        System.out.println("are you vegetarian");
        String veg=my.nextLine();

        System.out.println("enter the number of days");
        int days=my.nextInt();

        individual person1=new individual();
        person1.name=name;
        person1.guest=guest;
        person1.veg=veg;
        person1.days=days;
        int ret=person1.bill(name, guest, veg, days);
        System.out.println("total bill for "+ name+ ':');
        System.out.println(ret);
        
    }
}