public class DigitsExplosion {

    public static String explode(String digits) {
        StringBuilder sb = new StringBuilder();
        String[] arr = digits.split("");

        for (String i : arr) {
            sb.append(i.repeat(Integer.parseInt(i)));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(explode("05"));
    }
}
