import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IsThisTriangle {
    public static boolean isTriangle(int a, int b, int c) {
        List<Integer> list = Arrays.asList(a, b, c);
        Collections.sort(list);
        return (list.get(0) + list.get(1)) > list.get(2);
    }
    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 2));
        System.out.println(isTriangle(12, 120, 12));
    }
}
