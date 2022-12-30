public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        String result = "Draw";
        switch (p1) {
            case "paper":
                if (p2.equals("rock")) {
                    result = "Player 1 won!";
                }
                if (p2.equals("scissors")) {
                    result = "Player 2 won!";
                }
                break;

            case "rock":
                if (p2.equals("scissors")) {
                    result = "Player 1 won!";
                }
                if (p2.equals("paper")) {
                    result = "Player 2 won!";
                }
                break;

            case "scissors":
                if (p2.equals("paper")) {
                    result = "Player 1 won!";
                }
                if (p2.equals("rock")) {
                    result = "Player 2 won!";
                }
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(rps("paper", "scissors")); //Player 2 won!
        System.out.println(rps("paper", "rock")); //Player 1 won!

        System.out.println(rps("rock", "scissors")); //Player 1 won!
        System.out.println(rps("scissors", "rock")); //Player 2 won!
        System.out.println(rps("paper", "paper"));   //Draw
    }
}
