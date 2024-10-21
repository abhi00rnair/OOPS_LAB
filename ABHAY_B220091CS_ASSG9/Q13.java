import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        int[] numbers = {};
        int product = Arrays.stream(numbers)
                            .reduce(1, (a, b) -> a * b);

        System.out.println(product);
    }
}
