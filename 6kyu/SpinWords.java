public class SpinWords {

    public static String spinWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] arr = sentence.split(" ");

        for (String i : arr) {
            if (i.length() >= 5) {
                StringBuilder s = new StringBuilder(i).reverse();
                sb.append(s);
            } else {
                sb.append(i);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Hey wollef sroirraw"));
        System.out.println(spinWords("emocleW"));
    }
}
