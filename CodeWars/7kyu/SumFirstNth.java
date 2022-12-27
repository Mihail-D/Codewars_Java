import java.util.stream.IntStream;

public class SumFirstNth {
    public static String seriesSum(int n) {
        return String.format("%.2f", IntStream.range(0, n).mapToDouble(num -> 1.0 / (1 + num * 3)).sum());
    }
    public static void main(String[] args) {
        System.out.println(seriesSum(15));
    }

}