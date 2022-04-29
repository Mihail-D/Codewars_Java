import java.util.ArrayList;
import java.util.List;

public class PushObjectIntoArray {
    public static List<String> foo(Object object){
        List<String> items = new ArrayList<>();
        items.add((String) object);
        return items;
    }
    
    public static void main(String[] args) {
            System.out.println(foo("an object"));
        }
}
