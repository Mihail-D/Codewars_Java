public class WellOfIdeas_Easy {
    public static String well(String[] x) {
        int count = 0;
        String answer = "";

        for (String i : x) {
            if (i.equals("good")) {
                count++;
            }
            ;
        }

        if (count == 0) {
            answer += "Fail!";
        }
        else if (count > 2) {
            answer += "I smell a series!";
        }
        else {
            answer += "Publish!";
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(well(new String[]{
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}
