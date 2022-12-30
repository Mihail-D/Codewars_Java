import java.util.Arrays;

public class ToSquare_NotToSquare {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) == (int) Math.sqrt(array[i])) {
                arr[i] = (int) Math.sqrt(array[i]);
            }
            else {
                arr[i] = (int) Math.pow(array[i], 2);
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{4, 3, 9, 7, 2, 1})));
    }
}
