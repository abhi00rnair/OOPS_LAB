
import java.util.List;
import java.util.function.Predicate;

public class Q8{
    public static void main(String[] args) {
        List<String>arr=List.of("abhay","sid","aa","aqr");
        Predicate<String>pr=word->word.startsWith("a");
        arr.stream().filter(pr).forEach(System.out::println);
    }
}