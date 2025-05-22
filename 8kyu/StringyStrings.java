public class StringyStrings {
    public static String stringy(int size) {
        String str = new String(new char[Math.round((long) size/2)]).replace("\0", "10");
        return size % 2 == 0 ? str : str + "1";
    }
    
    public static void main(String[] args) {
            System.out.println(stringy(19));
        }
}
