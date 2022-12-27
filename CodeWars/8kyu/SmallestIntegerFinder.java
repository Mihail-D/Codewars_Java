public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for (int arg : args) {
            if (arg < smallest) {
                smallest = arg;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{78, 56, 232, 12, 11, 43}));
    }
}
