public class SimpleBeadsCount {
    public static int countRedBeads(final int nBlue) {
        return nBlue < 2 ? 0 : 2 * nBlue - 2;
    }
    public static void main(String[] args) {
        System.out.println(countRedBeads(5));
    }
}
