import java.util.Arrays;

public class AveragesNumbers {

        public static double[] averages(final int[] numbers) {
            final double res[] = new double[(numbers == null || numbers.length == 0) ? 0 : numbers.length - 1];
            for (int i = 0; i < res.length; i++) res[i] = (numbers[i]+numbers[i+1]) / 2.0;
            return res;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(averages(null)));
    }
}
