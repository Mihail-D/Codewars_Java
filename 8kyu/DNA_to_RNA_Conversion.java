public class DNA_to_RNA_Conversion {
    public static String dnaToRna(String dna) {
        dna = dna.replaceAll("T", "U");
        return dna;
    }

    public static void main(String[] args) {
        System.out.println(dnaToRna("GCAT"));
    }
}
