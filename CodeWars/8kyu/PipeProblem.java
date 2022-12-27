import java.util.Arrays;

public class PipeProblem {
    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int[] arr = new int[max - min + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = min;
            min++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pipeFix(new int[]{6, 9})));
    }
}
