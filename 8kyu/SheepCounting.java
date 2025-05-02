public class SheepCounting {
    public static String countingSheep(int num) {
        String str = "";
        for (int i = 1; i <= num; i++) {
            str += (i + " sheep...");
        }
        return str;
    }
    
    public static void main(String[] args) {
            System.out.println(countingSheep(3));
        }
}
