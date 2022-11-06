public class TriangularTreasure {
    public static long triangular(long n) {
        return (n <= 0) ? 0 : n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        System.out.println(triangular(4));                // 10
        System.out.println(triangular(1275));             // 813450
        System.out.println(triangular(2));                // 3
    }
}
