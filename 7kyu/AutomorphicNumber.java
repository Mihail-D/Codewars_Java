public class AutomorphicNumber {
    public static String autoMorphic(int number) {
        String str = "" + (number * number);
        return Integer.parseInt(str.substring(str.length() - String.valueOf(number).length())) == number ?
                "Automorphic" : "Not!!";
    }
    public static void main(String[] args) {
        System.out.println(autoMorphic(9)); // not
        System.out.println(autoMorphic(25)); // yes
    }
}
