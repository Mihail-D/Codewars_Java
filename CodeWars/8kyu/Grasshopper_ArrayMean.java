import java.util.stream.IntStream;

public class Grasshopper_ArrayMean {
    public static int findAverage(int[] nums) {

        return (IntStream.of(nums).sum()) / nums.length;
    }
    
    public static void main(String[] args) {
            System.out.println(findAverage(new int[]{1,3,5,7})); // 4
        }
}
