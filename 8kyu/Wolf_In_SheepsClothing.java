public class Wolf_In_SheepsClothing {
    public static String warnTheSheep(String[] array) {
        String warning = "Pls go away and stop eating my sheep";

        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i].equals("wolf")) {
                warning = "Oi! Sheep number " + (array.length - i - 1) + "! " + "You are about to be eaten by a wolf!";
            }
        }
        return warning;
    }

    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf",
                "sheep", "sheep"}));
    }
}
