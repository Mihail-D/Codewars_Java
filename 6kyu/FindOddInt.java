public class FindOddInt {

    public static int findIt(int[] a) {
        for (int k : a) {
            int count = 0;
            for (int i : a) {
                if (k == i) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return k;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5}));
    }
}
