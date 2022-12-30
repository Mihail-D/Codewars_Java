import java.util.Arrays;

public class EnumerableMagic_25 {
    public static int[] take(int[] arr, int n) {
        return n < arr.length ? Arrays.copyOf(arr, n) : arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3)));
    }
}
