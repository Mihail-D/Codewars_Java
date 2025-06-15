public class TransportationOnVacation {
    public static int rentalCarCost(int d) {
        int total = 0;

        if (d >= 7) {
            total = (d * 40) - 50;
        }
        else if (d >= 3) {
            total = (d * 40) - 20;
        }
        else {
            total = d * 40;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(rentalCarCost(7));
    }
}
