import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        String result = "";
        Arrays.sort(s);
        String[] word = s[0].split("");

        for (int i = 0; i < word.length - 1; i++) {
            result += word[i] + "***";
        }

        return result + word[word.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(twoSort(new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }
}
