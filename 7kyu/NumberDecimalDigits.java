public class NumberDecimalDigits {
    public static int Digits(long n) {
        return ("" + n).length();
    }
    public static void main(String[] args) {
        System.out.println(Digits(12345L));      //  5
        System.out.println(Digits(9876543210L)); //  10
    }
}
