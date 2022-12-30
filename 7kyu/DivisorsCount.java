public class DivisorsCount {
    public static long numberOfDivisors(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.append(".");
            }
        }

        return result.length();
    }
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(30));
    }
}
