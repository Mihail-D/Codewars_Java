public class RemoveStringSpaces {
    static String noSpace(final String x) {
        String[] arr = x.split(" ");
        StringBuilder str = new StringBuilder();
        for (String s : arr) {
            if (!s.equals(" ")) {
                str.append(s);
            }
        }

        return str.toString();
        //return x.replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
    }
}
