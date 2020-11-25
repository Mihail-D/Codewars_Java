import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum_No_Highest_Lowest {
    public static int sum(int[] numbers) {
        int sum = 0;

        if (numbers == null || numbers.length <= 1) {
            sum = 0;
        }
        else {
            List<Integer> list = new ArrayList<>(numbers.length);

            for (int number : numbers) {
                list.add(number);
            }

            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) > list.get(j)) {
                        Collections.swap(list, i, j);
                    }
                }
            }

            for (int i = 1; i < list.size() - 1; i++) {
                sum += list.get(i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(null));
        System.out.println(sum(new int[]{1}));
        System.out.println(sum(new int[]{}));
        System.out.println(sum(new int[]{6, 2, 1, 8, 10}));
    }
}
