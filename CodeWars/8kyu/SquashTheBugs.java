public class SquashTheBugs {
    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (String s : spl) {
            if (s.length() > longest) {
                longest = s.length();

            }
        }
        return longest;
    }
    public static void main(String[] args) {
        System.out.println(findLongest("The quick white fox jumped around the massive dog"));
    }
}
