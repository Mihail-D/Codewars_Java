import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorrectStringMmistakes {
    public static String correct(String string) {
        String[] strings = string.split("");
        List<String> list = new ArrayList<>(Arrays.asList(strings));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("1")) {
                list.remove(list.get(i));
                list.add(i,"I");
            }
            if (list.get(i).equals("0")) {
                list.remove(list.get(i));
                list.add(i,"O");
            }
            if (list.get(i).equals("5")) {
                list.remove(list.get(i));
                list.add(i,"S");
            }
        }


        String joined = String.join("", list);
        return joined;
    }
    
    public static void main(String[] args) {
            System.out.println(correct("1F-RUDYARD K1PL1NG"));
        }
}
