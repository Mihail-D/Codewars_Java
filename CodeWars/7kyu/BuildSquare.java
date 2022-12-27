public class BuildSquare {
    public static String generateShape(int n) {
        return ("+".repeat(n)+ "\n").repeat(n).trim();
    }
    public static void main(String[] args) {
            System.out.println(generateShape(8));
        }
}
