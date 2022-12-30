public class FindThePosition {
    public static String position(char alphabet) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: " + (str.indexOf(Character.toString(alphabet)) + 1);
    }
    
    public static void main(String[] args) {
            System.out.println(position('a'));
        }
}
