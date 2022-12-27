public class Sorted_Yes_No_How {
    public static String isSortedAndHow(int[] array) {
        String result;
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                count++;
            }
            else if (array[i] < array[i + 1]) {
                count--;
            }
        }

        if (count == array.length - 1) {
            result = "yes, descending";
        }
        else if (count == -(array.length - 1)) {
            result = "yes, ascending";
        }
        else {
            result = "no";
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(isSortedAndHow(new int[]{15, 7, 3, -8})); // yes, descending
        System.out.println(isSortedAndHow(new int[]{1, 2, 3, 4}));   // yes, ascending
        System.out.println(isSortedAndHow(new int[]{4, 2, 30}));     // no
    }
}
