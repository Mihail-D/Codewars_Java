public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        String[] newName = name.split(" ");

        return newName[0].toUpperCase().charAt(0) + "." + newName[1].toUpperCase().charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("sam Harris"));
    }
}
