public class FindMaximumAndMinimum {
    public static int min(int[] list) {
        int min = Integer.MAX_VALUE;
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int max(int[] list) {
        int max = Integer.MIN_VALUE;
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

