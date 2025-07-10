import java.util.Arrays;

public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

    public static void main(String[] args) {
        System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
    }
}
