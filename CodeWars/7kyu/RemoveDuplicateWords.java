import java.util.*;

public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String s) {
        List<String> str = new ArrayList<>(List.of(s.split(" ")));
        StringBuilder sb = new StringBuilder();
        String tmp;

        while (!str.containsAll(Collections.singleton("0"))) {
            for (int i = 0; i < str.size(); i++) {
                if (!str.get(i).equals("0")) {
                    tmp = str.get(i);
                    sb.append(str.get(i) + " ");
                    for (int j = 0; j < str.size(); j++) {
                        if (str.get(j).equals(tmp)) {
                            str.set(j, "0");
                        }
                    }
                }
            }
        }

        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta " +
                "gamma gamma gamma delta"));
    }
}
