import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String>arr=List.of("abhay","ccc");
        List<String>newarr=new ArrayList<>(arr.size());
        for(int i=0;i<arr.size();i++){
            String temp=arr.get(i).toUpperCase();
            newarr.add(temp);
        }
        System.out.println(newarr);
    }

}
