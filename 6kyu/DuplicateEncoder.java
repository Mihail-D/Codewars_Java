import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

    static String encode(String word) {
        Map<String, Integer> vault = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (String i : word.toLowerCase().split("")) {
            vault.merge(i, 1, Integer::sum);
        }

        for (String i : word.toLowerCase().split("")) {
            sb.append(vault.get(i) > 1 ? ")" : "(");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("(( @"));
        System.out.println(encode("Success"));
    }
}
