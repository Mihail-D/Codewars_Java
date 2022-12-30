import java.util.Arrays;

public class InviteMoreWomen {
    public static boolean inviteMoreWomen(int[] l) {
        return Arrays.stream(l).sum() > 0;
    }
    public static void main(String[] args) {
            System.out.println(inviteMoreWomen(new int[] {1, 1, 1}));
        }
}