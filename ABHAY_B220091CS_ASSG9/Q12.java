
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class student{
    int age;
    String name;

    student(int age, String name){
        this.age=age;
        this.name=name;
    }
    int getage(){
        return age;
    }
    String getname(){
        return  name;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Q12{
    public static void main(String[] args) {
        student s1=new student(10,"a");
        student s2=new student(10,"b");
        student s3=new student(11,"c");
        student s4=new student(9,"d");
        student s5=new student(9,"e");
        student s6=new student(11,"f");
        List<student> arr = new ArrayList<>(List.of(s1, s2, s3, s4, s5, s6));
        Map<Integer,List<String>>newarr=arr.stream().collect(Collectors.groupingBy(student::getage,Collectors.mapping(student::getname, Collectors.toList())));
        newarr.forEach((age, names) -> 
            System.out.println("Age: " + age + " -> " + names));   
     }
}