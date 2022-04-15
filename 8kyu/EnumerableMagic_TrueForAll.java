import java.util.Arrays;
import java.util.function.IntPredicate;

public class EnumerableMagic_TrueForAll {
    public static boolean all(int[] list, IntPredicate predicate){
        return Arrays.stream(list).allMatch(predicate);
    }
}
