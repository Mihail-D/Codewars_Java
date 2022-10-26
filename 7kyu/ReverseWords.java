import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(final String original) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(original.split(" ")));
        StringBuilder string;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            string = new StringBuilder();
            string.append(list.get(i)).reverse();
            result.append(string);
            if (i < list.size() - 1) {
                result.append(" ");
            }
        }
        return original.isBlank() ? original : result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
    }
}

// ehT kciuq nworb xof spmuj revo eht yzal .god