
public class WideMouthedFrog {
    public static String mouthSize(String animal){
        return animal.equalsIgnoreCase("alligator") ? "small" : "wide";
    }

    public static void main(String[] args) {
            System.out.println(mouthSize("toucan"));
        System.out.println(mouthSize("ALLIGATOR"));
        }
}
