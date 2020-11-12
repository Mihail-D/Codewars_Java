import java.util.Arrays;

public class CountTheMonkeys {
    public static int[] monkeyCount(final int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(10)));
    }
}
