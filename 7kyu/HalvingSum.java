public class HalvingSum {
    static int halvingSum(int n) {
        int result = 0;
        int halfN = n;

        for (int i = 0; i < n; i++) {
            result += halfN;
            halfN /= 2;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(halvingSum(25));
    }
}
