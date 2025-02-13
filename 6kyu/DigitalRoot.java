public class DigitalRoot {

    public static int digital_root(int n) {
        int sum;
        int result = n;

        while (result >= 10) {
            sum = 0;
            while (result > 0) {
                sum += result % 10;
                result /= 10;
            }
            result = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(493193)); // 2
    }
}
