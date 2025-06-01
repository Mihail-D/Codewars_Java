import java.util.Arrays;

public class SurfaceArea_and_Volume {
    public static int[] getSize(int w, int h, int d) {
        int[] arr = new int[]{(2 * (w * d + w * h + d * h)), (w * h * d)};
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(getSize(4, 2, 6));
    }
}
