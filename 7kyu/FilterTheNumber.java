public class FilterTheNumber {

    public static long filterString(final String value) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            boolean flag = Character.isDigit(value.charAt(i));
            if (flag) {
                result.append(value.charAt(i));
            }
        }

        return Long.parseLong(String.valueOf(result));
    }

    public static void main(String[] args) {
        System.out.println(filterString("aa1bb2cc3dd"));
    }

}
