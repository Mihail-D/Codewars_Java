public class SpeedControl {
    public static int gps(int s, double[] x) {
        double maxDiff = 0.0;
        for (int i = 0; i < x.length - 1; i++) {
            maxDiff = Math.max(x[i + 1] - x[i], maxDiff);
        }
        return (int) Math.floor(maxDiff * 3600.0 / s);
    }
    public static void main(String[] args) {
        System.out.println(gps(41, new double[]{0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25}));
    }
}
