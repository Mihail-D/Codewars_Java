import java.util.Arrays;

public class BarycenterTriangle {
  public static double[] barTriang(double[] x, double[] y, double[] z) {
    double a = (double) ((int) Math.round((x[0] + y[0] + z[0]) / 3 * 10000)) / 10000;
    double b = (double) ((int) Math.round((x[1] + y[1] + z[1]) / 3 * 10000)) / 10000;

    return new double[] {a, b};
  }

  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(
            barTriang(new double[] {4, 6}, new double[] {12, 4}, new double[] {10, 10})));
  }
}

// [7.3333, 4.6667]
