import java.util.Arrays;

public class MergesSortedArrays {


    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = new int[a1.length + a2.length];
        int[] tmp = new int[a1.length + a2.length];


    System.out.println(Arrays.toString(a1));
return tmp;
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(mergeArrays(new int[]{-30, -2, -1, 1}, new int[]{-15, -4, 7, 10})));
        }
}
// [-30, -15, -4, -2, -1, 1, 7, 10]