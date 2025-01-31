public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder result = new StringBuilder("(");

        for (int i = 0; i < numbers.length; i++) {
            if (i == 2) {
                result.append(numbers[i]).append(") ");
            } else if (i == 5) {
                result.append(numbers[i]).append("-");
            } else {
                result.append(numbers[i]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
