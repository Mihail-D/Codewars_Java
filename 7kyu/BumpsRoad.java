public class BumpsRoad {
    public static String bumps(final String road) {
        return (road.chars().filter(ch -> ch == 'n').count()) <= 15 ? "Woohoo!" : "Car Dead";
    }
    public static void main(String[] args) {
        System.out.println(bumps("__nn_nnnn__n_n___n____nn__nnn")); // "Woohoo!"
        System.out.println(bumps("_nnnnnnn_n__n______nn__nn_nnn")); // "Car Dead"
    }
}
