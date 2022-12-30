public class Watermelon {
    public static boolean divide(int weight) {
       return weight != 2 && weight - ((int) (Math.floor(weight / 2.0) * 2)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(divide(4));
        System.out.println(divide(2));
    }
}
