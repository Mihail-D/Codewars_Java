import java.util.Arrays;

public class TheHighestProfitWins {
    public static int[] minMax(int[] arr) {
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();

        int min = Arrays.stream(arr)
                .min()
                .getAsInt();


        return new int []{min, max};
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(minMax(new int[]{1, 2, 3, 4, 5})));
        }
}
