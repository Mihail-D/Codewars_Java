import java.util.Arrays;

public class GiftCodeSort {
    public static String sortGiftCode(String code) {
        String[] s = code.split("");
        Arrays.sort(s);

        return String.join("", s);
    }
    public static void main(String[] args) {
        System.out.println(sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }
}
