public class TheFeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        String x = beast.substring(0,1) + beast.substring(beast.length() - 1);
        String b = dish.substring(0,1) + dish.substring(dish.length() - 1);
        return x.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(feast("great blue heron", "garlic nann"));
        System.out.println(feast("brown bear", "bear claw"));
    }
}
