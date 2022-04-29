import java.util.Arrays;

public class PointsOfReflection {
    public static int[] reflectPoint(int[] p, int[] q) {
        return new int[]{2 * q[0] - p[0], 2 * q[1] - p[1]};
    }
    
    public static void main(String[] args) {
            System.out.println(Arrays.toString(reflectPoint(new int[]{10, -10}, new int[]{-10, 10})));
        }
}
