import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseNumber {
    public static int reverse(int number) {
        List<String> list = new ArrayList<>(List.of(("" + Math.abs(number)).split("")));
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();

        for (String i : list) {
            sb.append(i);
        }

        return number > 0 ? Integer.parseInt(String.valueOf(sb)) : -Integer.parseInt(String.valueOf(sb));
    }
    public static void main(String[] args) {
        System.out.println(reverse(-123));
        System.out.println(reverse(1000));
        System.out.println(reverse(5));
        System.out.println(reverse(358));
    }
}
