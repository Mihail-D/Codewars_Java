import java.util.*;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        Set<String> set = new HashSet<>(Arrays.asList((s1 + s2).split("")));
        TreeSet<String> myTreeSet = new TreeSet<>(set);

        return String.join("", myTreeSet.toArray(new String[myTreeSet.size()]));
    }

    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere")); // abcdefghilnoprstu
    }
}
