import java.util.Arrays;

public class MaxDiff {
    public static int maxDiff(int[] lst) {
        Arrays.sort(lst);
        return lst.length > 0 ? (lst[lst.length-1] - lst[0]) : 0;
    }
    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{-4, -5, -3, -1, -31})); // 30
        System.out.println(maxDiff(new int[]{1, 2, 3, 4, 5, 5, 4}));  // 4
        System.out.println(maxDiff(new int[]{ })); // 10
    }
}
