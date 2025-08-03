import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplit {

    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s = s + "_";
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i += 2) {
            result.add(s.substring(i, i + 2));
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("HelloWorld")));
        System.out.println(Arrays.toString(solution("HelloWorld!")));
    }
}
