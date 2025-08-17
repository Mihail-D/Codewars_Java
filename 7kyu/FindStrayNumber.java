import java.util.*;
import java.util.stream.Collectors;

public class FindStrayNumber {
    static int stray(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());

        return (Objects.equals(list.get(0), list.get(1))) ? list.get(list.size() - 1) : list.get(0);
    }
    public static void main(String[] args) {
        System.out.println(stray(new int[]{17, 17, 3, 17, 17, 17, 17}));
    }
}
