public class BeConcise_TernaryOperator {
  public static String describeAge(int age) {
    return "You're a(n) "
        + (age <= 12
            ? "kid"
            : age >= 13 && age <= 17 ? "teenager" : age >= 18 && age <= 64 ? "adult" : "elderly");
  }

  public static void main(String[] args) {
    System.out.println(describeAge(118));
  }
}
