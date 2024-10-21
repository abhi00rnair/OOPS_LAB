
import java.util.List;

public class Q6{
    public static void main(String[] args) {
        List<String>arr=List.of("abhay","sid","aa","aqr");
        arr.stream().filter(s->s.startsWith("a")).forEach(System.out::println);
    }
}