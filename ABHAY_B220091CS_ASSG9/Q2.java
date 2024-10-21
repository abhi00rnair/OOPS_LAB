import java.util.*;
@FunctionalInterface
interface print{
    public void func(List<String>arr);

}
public class Q2 {
    public static void main(String[] args) {
        List<String>arr=List.of("abhay","ssl","ccd");
        print p1=new print() {
            public void func(List<String>arr){
                for(int i=0;i<arr.size();i++){
                    System.out.println(arr.get(i));
                }
            }
        };
        p1.func(arr);
    }
}
