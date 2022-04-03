public class double_Char {
    public static String doubleChar(String s) {
        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].repeat(2);
        }

        String joinedString = String.join("", arr);
        return joinedString;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("String!"));
    }
}

