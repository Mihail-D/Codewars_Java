
import java.util.Arrays;

public class LostWithoutMap {
    public static int[] map(int[] arr) {
        int [] newArr = new int [arr.length];
        for (int i = 0; i < newArr.length; i++) {
           newArr[i] = arr[i] * 2;
        }

        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{2, 2, 2, 2, 2, 2})));
    }
}
