import java.util.Arrays;

public class MultiplyAllElementsArray {

    public static int[] multiplyAll(int[] array) {
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i] * 2;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiplyAll(new int[]{1, 2, 3})));
    }
}
