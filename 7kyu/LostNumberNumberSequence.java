import java.util.Arrays;

public class LostNumberNumberSequence {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        return  Arrays.stream(arr).sum() - Arrays.stream(mixedArr).sum();
    }
    public static void main(String[] args) {
            System.out.println(findDeletedNumber(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{1,9,7,4,6,2,3,8}));
        }
}
