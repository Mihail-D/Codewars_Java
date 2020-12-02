import java.util.List;

public class SumMixedArray {
    public int sum(List<Object> mixed) {
        int sum = 0;

        for (int i = 0; i < mixed.size(); i++) {
            if (mixed.get(i) instanceof String) {
                int x = Integer.parseInt((String) mixed.get(i));
                sum += x;
            }
            else {
                int y = (int) mixed.get(i);
                sum += y;
            }
        }
        return sum;
    }

}
