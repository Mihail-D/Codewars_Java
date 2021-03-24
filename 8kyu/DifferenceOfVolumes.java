public class DifferenceOfVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int a = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
        int b = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];

        return a > b ? a - b : b - a;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2})); // 106
    }
}
