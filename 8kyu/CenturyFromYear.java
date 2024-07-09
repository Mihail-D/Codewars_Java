public class CenturyFromYear {
    public static int century(int number) {
        int century = 0;

        if (number <= 100) {
            century = 1;
        }

        if (number > 100) {
            double x = (double) number / 100;
            int y = (int) x;
            double z = x - y;
            double roundOff = Math.round(z * 100.0) / 100.0;

            if (roundOff == 0.01) {
                century = y + 1;
            }
            else if (roundOff == 0.00) {
                century = y;
            }
            else {
                century = y + 1;
            }
        }

        return century;
    }

    public static void main(String[] args) {
        System.out.println(century(1601)); // 17
        System.out.println(century(1705)); // 18
        System.out.println(century(1900)); // 19
        System.out.println(century(2000)); // 20
        System.out.println(century(89));   // 1
    }
}
