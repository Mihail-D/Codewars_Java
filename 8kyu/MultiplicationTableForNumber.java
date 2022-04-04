public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        String result = "";

        for (int i = 1; i <= 10; i++) {
            result += (String.valueOf(i) + " * " + String.valueOf(num) + " = " + String.valueOf(i * num));
            if (i < 10) result += "\n";
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(multiTable(5));
    }
}
