public class HolidayVIII_DutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        float diff = (normPrice * (float) discount / 100);
        return (int) (hol / diff);
    }

    public static void main(String[] args) {
        System.out.println(dutyFree(12, 50, 1000));
        System.out.println(dutyFree(17, 10, 500));
        System.out.println(dutyFree(24, 35, 3000));
        System.out.println(dutyFree(1400, 35, 10000));
        System.out.println(dutyFree(700, 26, 7000));
    }
}
