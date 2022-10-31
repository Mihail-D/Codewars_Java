public class Factorial {
    public static int factorial(int n) {
        int fac = 1;
        if(n < 0 || n > 12) throw new IllegalArgumentException("Useless fuffery!");
        for (int i = n; i > 1 ; i--) {
            fac += fac * (i - 1);
        }
        return fac;
    }
    public static void main(String[] args) {
            System.out.println(factorial(133)); //120
        }
}
