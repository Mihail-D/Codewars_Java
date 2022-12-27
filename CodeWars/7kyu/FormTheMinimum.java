import java.util.TreeSet;

public class FormTheMinimum {
    public static int minValue(int[] values) {
        TreeSet<Integer> ts = new TreeSet<>();
        StringBuilder str = new StringBuilder();
        for (int i : values) {
            ts.add(i);
        }
        for (int j : ts) {
            str.append(j);
        }

        return Integer.parseInt(str.toString());
    }
    public static void main(String[] args) {
        System.out.println(minValue(new int[]{6, 7, 8, 7, 6, 6})); // 678
    }
}
