public class Grasshopper_PersonalizedMessage {
    static String greet(String name, String owner) {
        return "Hello " + (name.equals(owner) ? "boss" : "guest");
    }
    
    public static void main(String[] args) {
            System.out.println(greet("Daniel","Daniel"));
        System.out.println(greet("Daniel","Mike"));
        }
}
