import java.util.Arrays;

public class MinimizeSumOfArray {
    public static int minSum(int[] passed) {
        int sum = 0;
        Arrays.sort(passed);
        for (int i = 0; i < passed.length / 2; i++) {
            sum += (passed[i] * passed[(passed.length - 1) - i]);
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(minSum(new int[]{5, 4, 2, 3}));
        System.out.println(minSum(new int[]{12, 6, 10, 26, 3, 24}));
        System.out.println(minSum(new int[]{9, 2, 8, 7, 5, 4, 0, 6}));
    }
}
