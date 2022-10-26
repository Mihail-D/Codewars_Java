public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (!(Integer.toString(i).contains("5"))) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4, 17)); // 12
    }
}
