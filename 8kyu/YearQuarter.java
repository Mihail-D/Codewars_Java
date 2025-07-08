public class YearQuarter {
    public static int quarterOf(int month) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int quarter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j : arr[i]) {
                if (j == month) {
                    quarter = i + 1;
                }
            }
        }

        return quarter;
    }

    public static void main(String[] args) {
        System.out.println(quarterOf(2));
        System.out.println(quarterOf(6));
        System.out.println(quarterOf(12));
    }
}
