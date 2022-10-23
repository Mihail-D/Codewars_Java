public class BeginnerSeries_3_SumOfNumbers {
    public static int GetSum(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(GetSum(0, 1));
        System.out.println(GetSum(5, 5));
    }
}
