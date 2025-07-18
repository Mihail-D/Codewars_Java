import java.util.ArrayList;
import java.util.Collections;

public class ArraySumSingles {
    public static int repeats(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i : arr) {
            list.add(i);
        }

        for (int i : list) {
            if (Collections.frequency(list, i) < 2) {
                sum += i;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(repeats(new int[]{16, 0, 11, 4, 8, 16, 0, 11})); // 12
    }
}
