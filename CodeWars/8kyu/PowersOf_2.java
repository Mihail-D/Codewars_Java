import java.util.Arrays;

public class PowersOf_2 {
    public static long[] powersOfTwo(int n) {
        long[] arr = new long[n+1];
        arr[0] = 1;
        long x = 1;
        for (int i = 1; i < n+1; i++) {
            x *= 2;
            arr[i] = x;
        }
        return arr;
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(powersOfTwo(58)));
        }
}
