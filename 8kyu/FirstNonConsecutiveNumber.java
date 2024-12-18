public class FirstNonConsecutiveNumber {
    static Integer find(final int[] array) {
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;

            if (array[i] < 0) {
                if (array[i] + Math.abs(array[j]) != -1) {
                    result = array[j];
                    break;
                }
            }

            if (array[i] > 0) {
                if (array[j] - array[i] != 1) {
                    result = array[j];
                    break;
                }
            }
        }

        return result > Integer.MIN_VALUE ? result : null;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{-5, -3, -2, -1, 0, 1}));
        System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
    }
}
