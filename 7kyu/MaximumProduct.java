
public class MaximumProduct {
    public static int adjacentElementsProduct(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > result) {
                result = array[i] * array[i + 1];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48}));
    }
}
