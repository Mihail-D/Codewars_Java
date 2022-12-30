import java.util.Arrays;

public class AlternateCapitalization {
    public static String[] capitalize(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sb1.append(arr[i].toUpperCase());
                sb2.append(arr[i]);
            }
            else {
                sb1.append(arr[i]);
                sb2.append(arr[i].toUpperCase());
            }
        }

        return new String[]{String.valueOf(sb1), String.valueOf(sb2)};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitalize("dcnfftagmfjy"))); // "CoDeWaRrIoRs", "cOdEwArRiOrS"
    }
}
