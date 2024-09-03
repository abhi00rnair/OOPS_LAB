
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q9{
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        String s=my.nextLine();
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer>entry:mp.entrySet())
        System.out.println("key ="+ entry.getKey() +" "+ "value =" + entry.getValue() );
    }
}