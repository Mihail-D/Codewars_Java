import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing123 {
    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= lines.size(); i++) {
            String str = i + ": " + lines.get(i - 1);
            result.add(i - 1, str);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }
}
