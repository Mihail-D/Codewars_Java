public class NeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        String message = "";
        for (int i = 0; i < haystack.length; i++) {

            if (haystack[i] == null) {
                continue;
            }
            if (haystack[i].equals("needle")) {
                message = "found the needle at position " + i;
            }
        }
        return message;
    }

    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{"hay", null, "junk", "hay", "hay", "moreJunk", "needle",
                "randomJunk"}));
    }
}
