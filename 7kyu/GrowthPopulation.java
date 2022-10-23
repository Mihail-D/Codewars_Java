public class GrowthPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;

        while (p0 <= p) {
            p0 += p0 * percent / 100 + aug;
            years++;
        }
        System.out.println(years);
        return years;
    }
    public static void main(String[] args) {
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }
}

// p0 - исходное
// процент
// aug - прибыли
// p - целевой показатель