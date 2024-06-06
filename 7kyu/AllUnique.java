import java.util.HashSet;
import java.util.List;

public class AllUnique {
    public static boolean hasUniqueChars(String str) {
        return str.length() == new HashSet<>(List.of(str.split(""))).size();
    }
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcde"));
        System.out.println(hasUniqueChars("  nAa"));
    }
}
