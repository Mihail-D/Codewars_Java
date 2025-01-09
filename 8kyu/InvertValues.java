import java.util.Arrays;

public class InvertValues {
    public static int[] invert(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                newArray[i] = (-array[i]);
            }
            if (array[i] < 0) {
                newArray[i] = Math.abs(array[i]);
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{-1, 2, -3, 4, -5})));
    }
}
