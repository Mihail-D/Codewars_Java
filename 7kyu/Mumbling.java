public class Mumbling {
  public static String accum(String s) {
    String[] arr = s.split("");
    StringBuilder result = new StringBuilder();
    String repString;

    for (int i = 0; i < arr.length; i++) {
      repString = arr[i].toUpperCase() + arr[i].repeat(i).toLowerCase();
      result.append(repString).append("-");
    }

    return result.substring(0, result.length() - 1);
  }

  public static void main(String[] args) {
    System.out.println(accum("HbideVbxncC"));
  }
}
