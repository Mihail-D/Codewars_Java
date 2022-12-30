import java.util.Arrays;

public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears == 1) {
            return new int[]{humanYears, 15, 15};
        }
        int catYears = 24 + (4 * (humanYears - 2));
        int dogYears = 24 + (5 * (humanYears - 2));
        return new int[]{humanYears, catYears, dogYears};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10))); // int[]{10,56,64}
    }
}

/*
    Cat Years

        15 cat years for first year
        +9 cat years for second year
        +4 cat years for each year after that

    Dog Years

        15 dog years for first year
        +9 dog years for second year
        +5 dog years for each year after that
*/
