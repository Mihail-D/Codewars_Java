import java.util.Arrays;

public class AlphabetSymmetry {
    public static int[] solve(String[] arr) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String[] s = arr[i].split("");
            for (int j = 0; j < s.length; j++) {
                if (str.indexOf(s[j].toLowerCase()) == j) {
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new String[]{"abode","ABc","xyzD"}))); // 6,5,7
    }
}
