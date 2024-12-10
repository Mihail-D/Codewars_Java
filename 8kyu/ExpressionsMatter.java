import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c) {
        List<Integer> list = new ArrayList<>(4);

        list.add(a + b + c);
        list.add(a * b * c);
        list.add((a+b)*c);
        list.add(a*(c+b));

        Collections.sort(list);

        return list.get(3);
    }

    public static void main(String[] args) {
        System.out.println(expressionsMatter(22, 101, 25));
    }
}
