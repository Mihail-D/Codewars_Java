import java.util.*;

public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit) {
        TreeSet<Integer> result = new TreeSet<>(List.of(Arrays.stream(a).boxed().toArray(Integer[]::new)));
        return result.last() <= limit;
    }
    public static void main(String[] args) {
            System.out.println(smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100)); // false
            System.out.println(smallEnough(new int[] { 66, 101 }, 200));
        }
}
