
import java.util.List;
import java.util.stream.Collectors;

public class Q5{
    public static void main(String[] args) {
        List<String>arr=List.of("abhay","sid","ccc","d");
        List<Integer>newarr=arr.stream().map(String::length).collect(Collectors.toList());
        System.out.println(newarr);
    }
}