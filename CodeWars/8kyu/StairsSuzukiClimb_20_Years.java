public class StairsSuzukiClimb_20_Years {
  public static long stairsIn20(int[][] stairs) {
    long sum = 0;

    for (int i = 0; i < stairs.length; i++) {
      for (int j = 0; j < stairs[i].length; j++) {
        sum += stairs[i][j];
      }
    }
    return sum * 20;
  }

  public static void main(String[] args) {
    int[] sunday = {6737, 7244};

    int[] monday = {9175, 7883};

    int[] tuesday = {8646, 6945};

    int[] wednesday = {6353, 9605};

    int[] thursday = {6149, 6439};

    int[] friday = {5000, 5642};

    int[] saturday = {5448, 8041};

    System.out.println(
        stairsIn20(new int[][] {sunday, monday, tuesday, wednesday, thursday, friday, saturday}));
  }
}
