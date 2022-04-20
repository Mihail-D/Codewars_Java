public class AgeRangeCompatibilityEquation {
  public static String datingRange(int age) {
    return age > 14
        ? (age / 2) + 7 + "-" + (age - 7) * 2
        : (int) (0.90 * age) + "-" + (int) (1.10 * age);
  }

  public static void main(String[] args) {
    System.out.println(datingRange(5));
  }
}

// (int)(0.90*age) + "-" + (int)(1.10*age)
