import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder str = new StringBuilder();
        for (Integer i : binary) {
            str.append(i);
        }
        return Integer.parseInt(String.valueOf(str), 2);
    }
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(Arrays.asList(0, 0, 0, 1)));
    }
}
