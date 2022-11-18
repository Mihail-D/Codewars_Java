public class SumOfNumbers {
    public static String showSequence(int value) {
        String result = "";
        int sum = 0;

        if (value == 0) {
            result = "0=0";
        }
        else if (value < 0) {
            result = "" + value + "<0";
        }
        else {
            for (int i = 0; i <= value; i++) {
                result += i + "+";
                sum += i;
            }
            result = result.substring(0, result.length() - 1) + " = " + sum;
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(showSequence(-15)); // 21 0+1+2+3+4+5+6 = 21
    }
}
