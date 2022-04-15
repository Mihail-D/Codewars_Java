public class StrangeTripToTheMarket {
  public static boolean isLockNessMonster(String s) {
    boolean b = false;

    if (s.contains("tree fiddy") || s.contains("3.50") || s.contains("three fifty")) {
      b = true;
    }

    return b;
  }

  public static void main(String[] args) {
    System.out.println(
        isLockNessMonster(
            "Your girlscout cookies are ready to ship. Your total comes to tree fiddy"));
    System.out.println(
        isLockNessMonster(
            "Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance."));
  }
}
