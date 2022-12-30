public class TotalAmountOfPoints {
    public static int points(String[] games) {
        int sum = 0;
        for (String game : games) {
            int a = Integer.parseInt(game.substring(0, 1));
            int b = Integer.parseInt(game.substring(2));

            if (a > b) {
                sum += 3;
            }
            if (a == b) {
                sum += 1;
            }

        }
        return sum;
    }
    
    public static void main(String[] args) {
            System.out.println(points(new String[]
                    {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
        }
}
