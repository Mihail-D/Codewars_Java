public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        int thresh = 0;

        if (arr1.length >= arr2.length) {
            thresh = arr1.length;
        }
        if (arr1.length <= arr2.length) {
            thresh = arr2.length;
        }

        for (int i = 0; i < thresh; i++) {
            sum += (arr1[i] + arr2[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }
}
