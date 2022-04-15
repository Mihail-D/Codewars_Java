public class NumberDrills_BlueRedMarbles {
  public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
    double totalBlues = blueStart - bluePulled;
    double totalReds = redStart - redPulled;

    return totalBlues / (totalBlues+totalReds);
  }

  public static void main(String[] args) {
    System.out.println(guessBlue(5, 5, 2, 3)); // 0.6
    System.out.println(guessBlue(5, 7, 4, 3)); // 0.2
  }
}
