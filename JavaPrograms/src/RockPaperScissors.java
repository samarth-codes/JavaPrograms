import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    public static String rockPaperScissors(String playermove, String computermove) {
        String result = "";

        switch (playermove) { //switch case for player moves)
            case "rock": //rock case
                if (computermove.equals("paper")) {
                    result = ("Computer move:" + " " + computermove + " " + "\nYou lose!");
                    break;
                } else if (computermove.equals("scissors")) {
                    result = ("Computer move:" + " " + computermove + " " + "\nYou win!");
                    break;
                } else if (playermove.equals(computermove)) {
                    result = ("Computer move:" + " " + computermove + " " + "\nThe game was a tie.");
                    break;
                }
            case "paper": //paper case
                if (computermove.equals("rock")) {
                    result = ("Computer move:" + " " + computermove + " " + "\nYou win!");
                    break;
                } else if (computermove.equals("scissors")) {
                    result = ("Computer move:" + " " + computermove + " " + "\nYou lose!");
                    break;
                } else if (playermove.equals(computermove)) {
                    result = ("Computer move:" + " " + computermove + " " + "\nThe game was a tie.");
                    break;
                }
            case "scissors": //scissors case
                if (computermove.equals("rock")) {
                    result = ("Computer move:" + " " + computermove + " " + "\nYou lose!");
                    break;
                } else if (computermove.equals("paper")) {
                    result = ("Computer move:" + " " + computermove + " " + "\nYou win!");
                    break;
                } else if (playermove.equals(computermove)) {
                    result = ("Computer move:" + " " + computermove + " " + "\nThe game was a tie.");
                    break;
                }

        }

        String output = new String(result);
        return output;
    }

    public static void main(String[] args) {

        RockPaperScissors rps = new RockPaperScissors();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your move (rock,paper,scissors): ");
        String playermove = input.nextLine();


        String[] moves = {"rock","paper","scissors"};
        String computermove = moves[new Random().nextInt(moves.length)];

        System.out.println (rps.rockPaperScissors(playermove, computermove));
    }
}
