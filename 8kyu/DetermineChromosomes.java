public class DetermineChromosomes {
    public static String chromosomeCheck(String sperm) {
        return  "Congratulations! You're going to have a " + (sperm.equals("XY") ? "son." : "daughter.");
    }

    public static void main(String[] args) {
            System.out.println(chromosomeCheck("XY"));
            System.out.println(chromosomeCheck("XX"));
        }
}
