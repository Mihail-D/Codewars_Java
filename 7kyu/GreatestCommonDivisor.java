public class GreatestCommonDivisor {

    public static int compute(int x, int y) {
        int divisor = 1;
        for (int i = 1; i < Math.max(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                divisor = i;
            }
        }

        return divisor;
    }

    public static void main(String[] args) {
        System.out.println(compute(30, 12)); // 6
        System.out.println(compute(1, 1));   // 1
    }

}
