public class AllStarCodeChallenge_18 {
    public static int strCount(String str, char letter) {
        String[] arr = str.split("");
        int count = 0;
        String s = String.valueOf(letter);

        for (String i : arr) {
            if (i.equals(s)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(strCount("Hello", 'l'));
    }
}
