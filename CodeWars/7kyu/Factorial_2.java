public class Factorial_2 {
    public static long factorial(int n) {
        long fac = 1;

        for (int i = n; i > 1; i--) {
            fac += fac * (i - 1);
        }

        return n <= 1 ? 1 : fac;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4)); // 120
    }
}
