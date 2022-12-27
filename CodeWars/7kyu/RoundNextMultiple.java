public class RoundNextMultiple {
    public static int roundToNext5(int number) {
        int result;

        for (int i = number; ; i++) {
            if (i % 5 == 0) {
                result = i;
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
            System.out.println(roundToNext5(-5));
        }
}
