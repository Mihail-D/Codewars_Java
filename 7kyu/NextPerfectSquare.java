public class NextPerfectSquare {
    public static long findNextSquare(long sq) {
        double d = Math.sqrt(sq);
        long nextSquare = sq + 1;

        while (Math.sqrt(nextSquare) % 1 != 0) {
            if (d % 1 != 0) {
                nextSquare = -1;
                break;
            }
            nextSquare++;
        }

        return nextSquare;
    }
    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
        System.out.println(findNextSquare(625));
        System.out.println(findNextSquare(114));
    }
}
