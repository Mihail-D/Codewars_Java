import java.util.HashMap;
import java.util.Map;

public class PangramChecker {
    public static boolean check(String s) {
        String sentence = s.toLowerCase();

        Map<Character, Integer> alphabetMap = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetMap.put(c, 1);
        }

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            alphabetMap.remove(c);
        }

        return alphabetMap.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
        System.out.println(check("Pack my box with five dozen liquor jugs."));
    }
}
