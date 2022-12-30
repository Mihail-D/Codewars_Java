import java.util.Arrays;

public class LargestPairSum {
    public static int largestPairSum(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }
    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{-10, -8, -16, -18, -19})); // -18
        System.out.println(largestPairSum(new int[]{10, 14, 2, 23, 19}));      // 42
    }
}