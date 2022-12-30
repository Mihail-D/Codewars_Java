public class HextoDecimal {
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }

    public static void main(String[] args) {
        System.out.println(hexToDec("a"));
    }
}
