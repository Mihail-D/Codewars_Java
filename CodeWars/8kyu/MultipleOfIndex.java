import java.util.ArrayList;
import java.util.List;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> preResult = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                preResult.add(array[i]);
            }
        }
        return preResult.stream().mapToInt(i -> i).toArray();
    }
}
