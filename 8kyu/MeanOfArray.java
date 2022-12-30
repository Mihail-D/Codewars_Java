import java.util.stream.IntStream;

public class MeanOfArray {
    public static int getAverage(int[] marks){
        return (int) Math.floor((IntStream.of(marks).sum()) / marks.length);
    }

    public static void main(String[] args) {
        System.out.println(getAverage(new int[] {1,2,3,4,5}));
    }
}
