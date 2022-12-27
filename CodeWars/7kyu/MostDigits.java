
public class MostDigits {
    public static int findLongest(int[] numbers) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (String.valueOf(Math.abs(numbers[i])).length() > String.valueOf(Math.abs(numbers[index])).length()) {
                index = i;
            }
        }
        return numbers[index];
    }
    public static void main(String[] args) {
        System.out.println(findLongest(new int[]{-10, 1881401407, 0, 2137887584, 10}));
    }
}
