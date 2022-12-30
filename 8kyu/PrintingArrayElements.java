import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintingArrayElements {
    public static String printArray(Object array[]) {
        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}
