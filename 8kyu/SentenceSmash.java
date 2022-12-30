import java.util.Arrays;

public class SentenceSmash {
    public static String smash(String... words) {
        return String.join(" ", words);
    }
    
    public static void main(String[] args) {
            System.out.println(smash("Bilal", "Djaghout"));
        }
}
