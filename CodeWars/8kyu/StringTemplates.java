import java.util.Arrays;
import java.util.Formatter;

public class StringTemplates {
    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
    
    public static void main(String[] args) {
            System.out.println(buildString("Cheese","Milk","Chocolate"));
        }
}
