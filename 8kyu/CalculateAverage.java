import java.util.stream.IntStream;

public class CalculateAverage {
    public static double find_average(int[] array) {
        return IntStream.of(array).sum() / (double) array.length;

    }

    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1, 2, 3}));
    }
}
