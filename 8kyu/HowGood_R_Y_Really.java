import java.util.stream.IntStream;

public class HowGood_R_Y_Really {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = (IntStream.of(classPoints).sum()) / classPoints.length;
        return yourPoints > sum ? true : false;
    }
    
    public static void main(String[] args) {
            System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        }
}
