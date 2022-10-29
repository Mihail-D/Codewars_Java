public class MaximumMultiple {
    public static int maxMultiple(int divisor, int bound) {
        int result = 0;
        while (result + divisor <= bound) {
            result += divisor;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(maxMultiple(7, 15));
    }
}
