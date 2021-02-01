import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleByGivenNumber {
    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> list = new ArrayList<>();

        for (int i : numbers) {
            if (i % divider == 0) {
                list.add(i);
            }
        }

        int[] arr = list.stream().mapToInt(i -> i).toArray();

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)));
    }
}
