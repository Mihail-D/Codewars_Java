import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String[] arr = numberString.split("");
        List list = new ArrayList(Arrays.asList(arr));

        for (int i = 0; i < list.size(); i++) {
            String tmp = (String) list.get(i);
            list.remove(i);
            list.add(i, Integer.parseInt(tmp));

            if ((int) list.get(i) >= 5) {
                list.remove(i);
                list.add(i, 1);
            }
            else {
                list.remove(i);
                list.add(i, 0);
            }
        }

        String result = "";

        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).toString();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("1234567890"));
    }
}
