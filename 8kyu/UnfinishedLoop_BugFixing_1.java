import java.util.ArrayList;
import java.util.List;

public class UnfinishedLoop_BugFixing_1 {
    public static List<Integer> CreateList(int number) {
        List<Integer> list = new ArrayList<Integer>();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }
}
