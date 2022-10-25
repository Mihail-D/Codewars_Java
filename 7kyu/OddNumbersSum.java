public class OddNumbersSum {
    public static int rowSumOddNumbers(int n) {
        int lastInt = n * n + (n - 1);
        int lineLen = (n * 2) - 1;
        int firstInt = (lastInt - lineLen) + 1;
        int count = 0;

        while (lineLen > 0) {
            if (firstInt % 2 != 0) {
                count += firstInt;
            }
            firstInt++;
            lineLen--;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(42)); // 74088
    }
}
