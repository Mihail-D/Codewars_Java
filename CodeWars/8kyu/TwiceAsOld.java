public class TwiceAsOld {
    public static int twiceAssOld(int dadYears, int sonYears) {
        int result = 0;

        if (dadYears >= sonYears * 2) {
            result = dadYears - (sonYears * 2);
        }
        if (dadYears < sonYears * 2) {
            result = (sonYears * 2) - dadYears;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(twiceAssOld(30, 7)); //16
        System.out.println(twiceAssOld(30, 0)); //0
        System.out.println(twiceAssOld(45, 30)); //15
    }
}
