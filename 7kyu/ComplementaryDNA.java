
public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        String[] arr = dna.split("");
        String str = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("A")) {
                arr[i] = "T";
            }
            else if (arr[i].equals("T")) {
                arr[i] = "A";
            }
            if (arr[i].equals("C")) {
                arr[i] = "G";
            }
            else if (arr[i].equals("G")) {
                arr[i] = "C";
            }
        }
        return str.join("", arr);
    }
    public static void main(String[] args) {
        System.out.println(makeComplement("TAACG"));  // ATTGC  (A-T C-G)
    }
}
