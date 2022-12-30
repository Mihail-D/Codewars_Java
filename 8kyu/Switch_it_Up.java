import java.util.HashMap;
import java.util.Map;

public class Switch_it_Up {
    public static String switchItUp(int number) {
        HashMap<Integer, String> map = new HashMap(10);
        map.put(0,"Zero");
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");
        map.put(9,"Nine");
        return map.get(number);
    }
    
    public static void main(String[] args) {
            System.out.println(switchItUp(3));
        }
}
