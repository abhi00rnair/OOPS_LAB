import java.util.Scanner;
public class Q10
{
public static void main(String[] args) {
Scanner my =new Scanner(System.in);
String p=my.next();
String q=my.next();
p=p+q;
q=p.substring(0,p.length()-q.length());
p=p.substring(q.length());
System.out.println("after the swap p ad q are");
System.out.println(p);
System.out.println(q);

}
}