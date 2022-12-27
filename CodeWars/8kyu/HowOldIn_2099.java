public class HowOldIn_2099 {
  public static String CalculateAge(int birth, int yearTo) {
    String message = "";
    if (birth < yearTo) {
      message = "You are " + (yearTo - birth) + " years old.";
      if ((yearTo - birth) == 1) message = "You are 1 year old.";
    } else if (birth > yearTo) {
      message = "You will be born in " + (birth - yearTo) + " years.";
      if ((yearTo - birth) == -1) message = "You will be born in 1 year.";

    } else message = "You were born this very year!";

    return message;
  }
}
