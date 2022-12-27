public class ReduceButGrow {
    public static int grow(int[] x) {
        int result = 1;
        for (int i : x) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(grow(new int[]{2, 2, 2, 2, 2, 2}));
    }
}
