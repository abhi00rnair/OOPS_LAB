
import java.util.List;
import java.util.stream.Collectors;

public class Q7{
    public static void main(String[] args) {
        List<String>arr=List.of("abhay","sid","aa","aqr");
        List<String>newarr=arr.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
        System.out.println(newarr);

    }
}