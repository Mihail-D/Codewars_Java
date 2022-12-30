import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumbersInOrder {
    public static boolean isAscOrder(int[] arr) {
        List<Integer> list = new java.util.ArrayList<>(Arrays.stream(arr).boxed().toList());
        Collections.sort(list);
        List<Integer> array = new java.util.ArrayList<>(Arrays.stream(arr).boxed().toList());

        return list.equals(array);
    }

    public static void main(String[] args) {
        System.out.println(isAscOrder(new int[]{1, 2, 4, 7, 19}));
        System.out.println(isAscOrder(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }
}
