public class LeonardoDicaprioAndOscars {
  public static String leo(final int oscar) {
    String result = "";
    if (oscar == 88) {
      result = "Leo finally won the oscar! Leo is happy";
    }
    else if (oscar == 86) {
      result = "Not even for Wolf of wallstreet?!";
    }
    else if (oscar < 88) {
      result = "When will you give Leo an Oscar?";
    }
    else {
      result = "Leo got one already!";
    }
    
    return result;
  }

  public static void main(String[] args) {
    System.out.println(leo(88)); // Leo finally won the oscar! Leo is happy
    System.out.println(leo(86)); // Not even for Wolf of wallstreet?!
    System.out.println(leo(83)); // When will you give Leo an Oscar?
    System.out.println(leo(90)); // Leo got one already!
  }
}

/*

if oscar was (integer) 88, you have to return "Leo finally won the oscar! Leo is happy".
if oscar was 86, you have to return "Not even for Wolf of wallstreet?!"
if it was not 88 or 86 (and below 88) you should return "When will you give Leo an Oscar?"
if it was over 88 you should return "Leo got one already!"

*/
