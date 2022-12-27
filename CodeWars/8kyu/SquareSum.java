public class SquareSum {
    public static int square(int[] n) {
        int sum = 0;
        for (int j : n) {
            sum += (Math.pow(j, 2));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(square(new int[]{1, 2, 2}));
    }
}

