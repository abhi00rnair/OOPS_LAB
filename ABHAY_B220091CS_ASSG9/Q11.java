
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class student{
    int age;
    String name;

    student(int age, String name){
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
public class Q11{
    public static void main(String[] args) {
        student s1=new student(10,"a");
        student s2=new student(10,"b");
        student s3=new student(11,"c");
        student s4=new student(9,"d");
        student s5=new student(9,"e");
        student s6=new student(11,"f");
        List<student> arr = new ArrayList<>(List.of(s1, s2, s3, s4, s5, s6));
        Comparator<student>compare=(x,y)->Integer.compare(x.age, y.age);
        arr.sort(compare);
        arr.forEach(System.out::println);
    }
}