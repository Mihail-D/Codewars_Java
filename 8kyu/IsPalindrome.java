public class IsPalindrome {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(text);
        return text.equalsIgnoreCase(sb.reverse().toString());
    }

    public static void main(String[] args) {
            System.out.println(isPalindrome("дом"));
            System.out.println(isPalindrome("lol"));
        System.out.println(isPalindrome("Madam, I'm Adam!"));
        }
}
