public class ThinkfulLogicDrills_TrafficLight {
    public static String updateLight(String current) {
        String[] lights = {"green", "yellow", "red"};
        String color = "green";
        for (String i : lights) {
            if (current.equals("green")) {
                color = "yellow";
            }
            if (current.equals("yellow")) {
                color = "red";
            }
        }
        return color;
    }

    public static void main(String[] args) {
        System.out.println(updateLight("red"));
        System.out.println(updateLight("green"));
        System.out.println(updateLight("yellow"));
    }
}
