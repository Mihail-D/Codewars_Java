public class TriangularNumbersSum {
    public static int sumTriangularNumbers(int n) {
        if (n <= 0) return 0;
        return n*(n+1)*(n+2)/6;
    }
    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(6));  //  56
        System.out.println(sumTriangularNumbers(34)); //  7140
    }
}
