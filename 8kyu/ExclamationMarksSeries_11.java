public class ExclamationMarksSeries_11 {
    public static String replace(final String s) {
        String[] arr = s.split("");
        String result = "";

        for (String i : arr) {
            if (i.matches("[aeiouAEIOU]")) {
                result += "!";
            }
            else {
                result += i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(replace("ABCDE"));
    }
}
