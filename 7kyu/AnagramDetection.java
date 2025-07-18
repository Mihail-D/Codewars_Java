import java.util.Arrays;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        if (test == null || original == null || test.length() != original.length()) {
            return false;
        }

        char[] ch1 = test.toLowerCase().toCharArray();
        char[] ch2 = original.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }
    public static void main(String[] args) {
        System.out.println(isAnagram("Buckethead", "DeathCubeK"));
    }
}
