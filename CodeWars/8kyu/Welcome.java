import java.util.HashMap;

public class Welcome {
    public static String greet(String language) {
        HashMap<String, String> map = new HashMap<>();
        map.put("english", "Welcome");
        map.put("czech", "Vitejte");
        map.put("danish", "Velkomst");
        map.put("dutch", "Welkom");
        map.put("estonian", "Tere tulemast");
        map.put("finnish", "Tervetuloa");
        map.put("flemish", "Welgekomen");
        map.put("french", "Bienvenue");
        map.put("german", "Willkommen");
        map.put("irish", "Failte");
        map.put("italian", "Benvenuto");
        map.put("latvian", "Gaidits");
        map.put("lithuanian", "Laukiamas");
        map.put("polish", "Witamy");
        map.put("spanish", "Bienvenido");
        map.put("swedish", "Valkommen");
        map.put("welsh", "Croeso");

        String str = map.get(language);

        return str != null ? str : "Welcome";
    }

    public static void main(String[] args) {
        System.out.println(greet("czech"));
    }
}



