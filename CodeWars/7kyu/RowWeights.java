import java.util.Arrays;

public class RowWeights {
    public static int[] rowWeights(final int[] weights) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                x += weights[i];
            }
            else {
                y += weights[i];
            }
        }
        return new int[]{x, y};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowWeights(new int[]{50, 60, 70, 80})));
    }
}
