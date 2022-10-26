import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        return (Arrays.stream(array).sum() % 2 == 0) ? "even" : "odd";
    }
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{0, -1, -5})); // odd
    }
}
