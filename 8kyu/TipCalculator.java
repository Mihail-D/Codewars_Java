public class TipCalculator {
  public static Integer calculateTip(double amount, String rating) {
    switch (rating.toLowerCase()) {
      case "terrible":
        return 0;
      case "poor":
        return (int) Math.ceil(0.05 * amount);
      case "good":
        return (int) Math.ceil(0.1 * amount);
      case "great":
        return (int) Math.ceil(0.15 * amount);
      case "excellent":
        return (int) Math.ceil(0.2 * amount);
      default:
        return null;
    }
  }

  public static void main(String[] args) {
    System.out.println(calculateTip(0, "Excellent"));
  }
}

/*
Terrible: tip 0%
Poor: tip 5%
Good: tip 10%
Great: tip 15%
Excellent: tip 20%
*/
