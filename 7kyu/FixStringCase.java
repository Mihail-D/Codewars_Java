public class FixStringCase {
    public static String solve(final String str) {
        String result = "";
        String[] arr = str.split("");
        int upperCase = 0;
        int lowerCase = 0;

        for (String i : arr) {
            if (i.equals(i.toLowerCase())) {
                lowerCase++;
            }
            else {
                upperCase++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (upperCase > lowerCase) {
                result += arr[i].toUpperCase();
            }
            else if (upperCase < lowerCase) {
                result += arr[i].toLowerCase();
            }
            else {
                result += arr[i].toLowerCase();
            }

        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(solve("code")); // code
        System.out.println(solve("codE")); // code
        System.out.println(solve("CODe")); // CODE
        System.out.println(solve("COde")); // code
    }
}
