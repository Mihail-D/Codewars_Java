
public class PalindromeChainLength {
    private static boolean isPalindrome(long n) {
        return Long.toString(n).equals(new StringBuilder(Long.toString(n)).reverse().toString());
    }
    private static long getReversed(long n) {
        return Long.parseLong(new StringBuilder(Long.toString(n)).reverse().toString());
    }
    public static int palindromeChainLength (long n) {
        int steps = 0;
        while (!isPalindrome(n)) {
            n += getReversed(n);
            steps ++;
        }
        return steps;
    }
    public static void main(String[] args) {
        System.out.println(palindromeChainLength(393)); // 0
        System.out.println(palindromeChainLength(89));  // 24
    }
}
