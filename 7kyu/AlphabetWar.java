import java.util.HashMap;
import java.util.Map;

public class AlphabetWar {
    public static String alphabetWar(String fight) {
        int left = 0;
        int right = 0;
        String result = "Let's fight again!";
        String [] arr = fight.split("");

        Map<String, Integer> mapLeft = new HashMap<>();
        Map<String, Integer> mapRight = new HashMap<>();
        mapLeft.put("w", 4);
        mapLeft.put("p", 3);
        mapLeft.put("b", 2);
        mapLeft.put("s", 1);
        mapRight.put("m", 4);
        mapRight.put("q", 3);
        mapRight.put("d", 2);
        mapRight.put("z", 1);

        for (String i : arr) {
            if (mapLeft.containsKey(i)) {
                left += mapLeft.get(i);
            }
            else if (mapRight.containsKey(i)) {
                right += mapRight.get(i);
            }
        }

        if (left > right) {
            result = "Left side wins!";
        }
        else if (right > left) {
            result = "Right side wins!";
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(alphabetWar("zdqmwpbs"));
        System.out.println(alphabetWar("zzzzs"));
    }
}
