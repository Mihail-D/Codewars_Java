public class SimpleValidation_UsernameWithRegex {
    public static boolean validateUsr(String s) {
        return s.matches("[a-z_\\\\d]{4,16}");
    }
    
    public static void main(String[] args) {
            System.out.println(validateUsr("Aa"));
        }
}

