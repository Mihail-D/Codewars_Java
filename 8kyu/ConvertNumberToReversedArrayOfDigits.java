import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        String newStr = "" + n;
        String[] arr = newStr.split("");
        int[] arrayOfNumbers = new int[newStr.length()];

        for (int i = 0; i < arr.length; i++) {
            arrayOfNumbers[arrayOfNumbers.length - (i + 1)] = Integer.parseInt(arr[i]);
        }

        return arrayOfNumbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(348597)));
    }
}
