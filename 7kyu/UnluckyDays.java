import java.time.LocalDate;

import static java.util.Calendar.FRIDAY;
import static java.util.stream.IntStream.range;

public class UnluckyDays {
    public static int unluckyDays(int year) {
        return range(1, 13).map(i -> LocalDate.of(year, i, 13).getDayOfWeek().equals(FRIDAY) ? 1 : 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(unluckyDays(2015));
    }
}
