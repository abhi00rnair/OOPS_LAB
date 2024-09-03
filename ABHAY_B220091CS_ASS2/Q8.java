import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class student{
    int rollno;
    String name;
    double height;
    double weight;
    String teacher;
    public void func(){
        System.out.println(teacher + '-'+ name);
    }

}

public class Q8{
    Scanner scan =new Scanner(System.in);
    Map<Integer, String> tr=new HashMap<>();
    Map<Double,student> st=new HashMap<>();
    public static void main(String[] args) {
        Q8 assign=new Q8();
        assign.run();
    }
    public void run(){
        System.out.println("enter the no of students to add");
        int n=scan.nextInt();
        
        tr.put(1, "Mr.sabu");
        tr.put(2, "Mrs. jaya");
        tr.put(3,"Dr, babu");
        for(int i=0;i<n;i++){

            student st1=new student();
            System.out.println("enter roll no");
            st1.rollno=scan.nextInt();
            System.out.println("enter full name");
            st1.name=scan.nextLine();
            scan.nextLine();
            System.out.println("enter height");
            st1.height=scan.nextInt();
            System.out.println("enter weight");
            st1.weight=scan.nextInt();
            System.out.println("choose teacher by id");
            int id=scan.nextInt();
            st1.teacher=tr.get(id);
            st.put(st1.height, st1);

        }
        System.out.println();
        /*Map<Double,student>sortmap=new TreeMap<>(st);
        System.out.println("student names and their assigned teachers");
        System.out.println(sortmap);*/
    }

}