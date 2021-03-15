import java.util.Arrays;

public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        String[] arr = ("" + n).split("");
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("0")) {
                count++;
            }
            else {
                break;
            }
        }

        String[] newArr = Arrays.copyOfRange(arr, 0, arr.length - count);

        return Integer.parseInt(String.join("", newArr));
    }

    public static void main(String[] args) {
        System.out.println(noBoringZeros(1450));
        System.out.println(noBoringZeros(960000));
        System.out.println(noBoringZeros(1050));
        System.out.println(noBoringZeros(-1050));
    }
}
