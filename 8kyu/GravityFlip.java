import java.util.Arrays;
import java.util.Collections;

public class GravityFlip {
        public static int[] flip(char dir, int[] arr) {
            if (dir == 'L') {
                arr = Arrays.stream(arr)
                        .boxed()
                        .sorted(Collections.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();
            } else Arrays.sort(arr);
            return arr;
        }
}