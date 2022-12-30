public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        return name + ((name.substring(0,1).toLowerCase().equals("r")) ? " plays" : " does not play") + " banjo";
    }

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Martin"));
        System.out.println(areYouPlayingBanjo("Rikke"));
    }
}
