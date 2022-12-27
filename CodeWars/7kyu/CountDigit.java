import java.util.stream.IntStream;

public class CountDigit {
    public static int nbDig(int n, int d) {

        return (int) IntStream
                .rangeClosed(0, n)
                .map(i -> i * i)
                .flatMap(i -> String.valueOf(i).chars())
                .mapToObj(i -> (char)i)
                .mapToInt(Character::getNumericValue)
                .filter(i -> i == d)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(nbDig(11011, 2)); // 11
    }
}
