public class SimpleFun_ReverseLetter {
    public static String reverseLetter(final String str) {
        String[] arr = str.split("");
        StringBuilder result = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i].matches("[a-zA-Z]+")) {
                result.append(arr[i]);
            }
        }
        System.out.println(result);
        return result.toString();
    }
    public static void main(String[] args) {
            System.out.println(reverseLetter("krish21an"));
        }
}
