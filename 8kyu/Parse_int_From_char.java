public class Parse_int_From_char {
    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.substring(0, 1));
    }
    
    public static void main(String[] args) {
            System.out.println(howOld("9 years old"));
        }
}
