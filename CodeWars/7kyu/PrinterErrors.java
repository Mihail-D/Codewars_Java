import java.util.Arrays;

public class PrinterErrors {
    public static String printerError(String s) {
        String[] alphabet = {"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] str = s.split("");
        int count = 0;
        boolean contains;

        for (String i : str) {
            contains = Arrays.asList(alphabet).contains(i);
            if (contains) {
                count++;
            }
        }

        return "" + count + "/" + s.length();
    }
    public static void main(String[] args) {
        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm")); // 3/56
    }
}
