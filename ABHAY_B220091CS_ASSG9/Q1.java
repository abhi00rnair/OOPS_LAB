import java.util.*;

@FunctionalInterface
interface print{
    public void fucn(List<String>arr);
}
public class Q1 {
    public static void main(String[] args) {
        /*Scanner scan=new Scanner(System.in);
        print p1=new print() {
            public void fucn(){
                List<String>arr=List.of("abhay","ssl","ccd");
                for(int i=0;i<arr.size();i++){
                    System.out.println(arr.get(i));
                }
            }
        };
        p1.fucn();*/
        List<String>arr=List.of("abhay","ssl","ccd");
        print p1=i->{
            for(String temp:arr){
                System.out.println(temp);
            }
        };
        p1.fucn(arr);
    }
}
