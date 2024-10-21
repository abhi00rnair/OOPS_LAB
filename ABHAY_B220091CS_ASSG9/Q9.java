
import java.util.List;

public class Q9{
    public static void main(String[] args) {
    List<String>arr=List.of("abhay","sid","aa","aqr");
    int totnumber=arr.stream().mapToInt(String::length).sum();
    System.out.println(totnumber);

    }
}