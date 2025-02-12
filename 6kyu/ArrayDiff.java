import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = new ArrayList<>(Arrays.stream(a).boxed().toList());
        List<Integer> listB = Arrays.stream(b).boxed().toList();

        listA.removeIf(listB::contains);

        return listA.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
    }
}
