public class ValidatePIN {
    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]+") && (pin.length() == 4 || pin.length() == 6);
    }
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("1.234"));
        System.out.println(validatePin("1234a"));
    }
}
