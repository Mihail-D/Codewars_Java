public class CreditCardMask {
    public static String maskify(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() - 4; i++) {
            sb.append("#");
        }

        return (str.length() < 4) ? str : sb + str.substring(str.length() - 4);
    }

    public static void main(String[] args) {
        System.out.println(maskify("646464661641646416"));
    }
}
