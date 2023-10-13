import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String r = "";
        String p = "";
        String s = "";
        String playerA = "";
        String playerB = "";
        String replay = "";
        do {
            System.out.println("Welcome! Player A, please select R, P, or S for" +
                    " either rock, paper, or scissors: ");
            playerA = in.nextLine();
            while (!playerA.equalsIgnoreCase("r") && !playerA.equalsIgnoreCase("p")
                    && !playerA.equalsIgnoreCase("s")) {
                System.out.println("Your selection is invalid, please select R, P, or S: ");
                playerA = in.nextLine();
            }
            System.out.println("Player B, select R, P, or S: ");
            playerB = in.nextLine();
            while (!playerB.equalsIgnoreCase("r") && !playerB.equalsIgnoreCase("p")
                    && !playerB.equalsIgnoreCase("s")) {
                System.out.println("Your selection is invalid, please select R, P, or S: ");
                playerB = in.nextLine();
            }
            if (playerA.equalsIgnoreCase("r")) {
                if (playerB.equalsIgnoreCase("r")) {
                    System.out.println("R = R, you tie!");
                } else if (playerB.equalsIgnoreCase("p")) {
                    System.out.println("Paper beats rock, Player B wins!");
                } else {
                    System.out.println("Rock beats scissors, Player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("p")) {
                if (playerB.equalsIgnoreCase("r")) {
                    System.out.println("Paper beats rock, Player A wins!");
                } else if (playerB.equalsIgnoreCase("p")) {
                    System.out.println("P = P, you tie!");
                } else {
                    System.out.println("Scissors beats paper, Player B wins!");
                }
            } else if (playerA.equalsIgnoreCase("s")) {
                if (playerB.equalsIgnoreCase("r")) {
                    System.out.println("Rock beats scissors, Player B wins!");
                } else if (playerB.equalsIgnoreCase("p")) {
                    System.out.println("Scissors beats paper, Player A wins!");
                } else {
                    System.out.println("S = S, you tie!");
                }
            }
            System.out.println("Would you like to play again? [Y/N]");
            replay = in.nextLine();
        } while (replay.equalsIgnoreCase("y"));
        System.exit(0);
    }
}