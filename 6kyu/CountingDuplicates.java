import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        Map<String, Integer> vault = new HashMap<>();
        String[] arr = text.toLowerCase().split("");
        int count = 0;

        for (String i : arr) {
            if (!vault.containsKey(i)) {
                vault.put(i, 1);
            } else {
                vault.merge(i, 1, Integer::sum);
            }

        }

        return (int) vault.values().stream().filter(i -> i > 1).count();
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("indivisibility")); //1
        System.out.println(duplicateCount("Indivisibilities")); //2
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix")); //26
    }
}
