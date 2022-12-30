public class BeginnerSeries_Clock {
    public static int Past(int h, int m, int s) {
        return (h * (3600000)) + (m * 60000) + (s * 1000);
    }

    public static void main(String[] args) {
        System.out.println(Past(0, 1, 1));
    }
}
