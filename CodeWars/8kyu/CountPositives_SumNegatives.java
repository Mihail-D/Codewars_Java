import java.util.Arrays;

public class CountPositives_SumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        int count = 0;
        int sum = 0;

        for (int j : input) {
            if (j > 0) {
                count++;
            }
            else {
                sum += j;
            }

        }

        return new int[]{count, sum};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(null)));
    }
}
