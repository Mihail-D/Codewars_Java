public class CountingSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep.equals(true)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Boolean[] arr = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        System.out.println(countSheeps(arr));
    }
}

