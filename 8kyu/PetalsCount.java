public class PetalsCount {
    public static String howMuchILoveYou(int nb_petals) {
        String[] arr = {
                "not at all", "I love you", "a little", "a lot", "passionately", "madly"
        };

        return arr[nb_petals % 6];
    }

    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(1));
        System.out.println(howMuchILoveYou(2));
        System.out.println(howMuchILoveYou(6));
        System.out.println(howMuchILoveYou(8));
    }
}
