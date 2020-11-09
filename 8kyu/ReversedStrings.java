public class ReversedStrings {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

     public static void main(String[] args) {
          System.out.println(solution("word"));
      }
}
