public class DeodorantEvaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        double thresholdMl = (content / 100) * threshold;
        int term = 0;

        while (content >= thresholdMl) {
            content -= (content / 100) * evap_per_day;
            term++;
        }

        return term;
    }
    public static void main(String[] args) {
        System.out.println(evaporator(10, 10, 10)); // 22
    }
}

//  the content of the evaporator (content in ml)
// the percentage of foam or gas lost every day (evap_per_day)
// and the threshold (threshold) in percentage beyond which the evaporator is no longer useful