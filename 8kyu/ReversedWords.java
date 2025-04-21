public class ReversedWords {
    public static String reverseWords(String str){
        String[] s = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            result.append(s[i]);
            result.append(" ");
        }

        return result.toString().trim();
    }

public static void main(String[] args) {
        System.out.println(reverseWords("I like eating"));
    }
}

