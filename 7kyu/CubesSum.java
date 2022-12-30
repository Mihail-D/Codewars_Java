public class CubesSum {
    public static long sumCubes(long n) {
        long result = 0;

        for (int i = 0; i < n; i++) {
            result += Math.pow(3, i);
            System.out.println(Math.pow(3, i));
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(sumCubes(3));  //   3025
    }
}
