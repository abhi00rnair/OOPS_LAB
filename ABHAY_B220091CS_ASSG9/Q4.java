import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<String>arr=List.of("abhay","ccc");
        List<String>newarr=new ArrayList<>();
        newarr=arr.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(newarr);
    }
    
}
