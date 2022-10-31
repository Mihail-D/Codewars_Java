public class Largest5DigitNumber {
    public static int solve(final String digits) {
        int result = 0;
        String str;

        for (int i = 0; i < digits.length() - 4; i++) {
            str = digits.substring(i, i + 5);
            if (Integer.parseInt(str) > result) {
                result = Integer.parseInt(str);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(solve("283910")); // 83910
        System.out.println(solve("731674765")); // 67890
    }
}
