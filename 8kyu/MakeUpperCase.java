public class MakeUpperCase {
    public static String MakeUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        String[] arr = str.split("");
        for (String s : arr) {
            result.append(s.toUpperCase());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(MakeUpperCase("hello"));
    }
}
