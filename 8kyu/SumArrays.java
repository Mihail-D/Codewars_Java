import java.util.Arrays;

public class SumArrays {
    public static double sum(double[] numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }

        return sum;
    }
    
    public static void main(String[] args) {
            System.out.println(Arrays.toString(new double[]{1, 5.2, 4, 0, -1}));
        }
}
