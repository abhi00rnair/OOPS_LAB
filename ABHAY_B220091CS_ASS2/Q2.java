import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = my.nextLine();
        System.out.println("Enter the string you want to replace:");
        String replace = my.nextLine();
        System.out.println("Replace with:");
        String temp = my.nextLine();
        my.close();
        char arr[] = s.toCharArray();
        char repl[] = replace.toCharArray();
        char tp[] = temp.toCharArray();

        int i = 0;
        while (i < arr.length) {
            if (arr[i] != ' ') {
                int j = i;
                int index = 0;
                char[] tempp = new char[repl.length];
                
                while (i < arr.length && arr[i] != ' ' && index < repl.length) {
                    tempp[index] = arr[i];
                    index++;
                    i++;
                }
                if (Arrays.equals(tempp, repl)) {
                    for (int x = 0; x < tp.length; x++) {
                        arr[j + x] = tp[x];
                    }
                }
                i = j + index;
            } else {
                i++;
            }
        }
        String ret = new String(arr);
        System.out.println(ret);
    }
}
