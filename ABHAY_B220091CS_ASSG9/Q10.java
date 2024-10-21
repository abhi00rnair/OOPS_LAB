
import java.util.List;

class student{
    int age;
    String name;

    student(int age, String name){
        this.age=age;
        this.name=name;
    }
}
public class Q10{
    public static void main(String[] args) {
        student s1=new student(10,"a");
        student s2=new student(10,"b");
        student s3=new student(11,"c");
        student s4=new student(9,"d");
        student s5=new student(9,"e");
        student s6=new student(11,"f");
        List<student>arr=List.of(s1,s2,s3,s4,s5,s6);
        //System.out.println(arr.size());
        int average=arr.stream().mapToInt(s->s.age).sum();
        System.out.println(average/arr.size());
        

    }
}