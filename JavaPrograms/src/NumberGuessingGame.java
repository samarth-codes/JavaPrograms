import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {

    public static void main(String[] args) {

        System.out.println("Number Guessing Game (1-100)");
        Random rand = new Random();
        int num = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        guessingGame(num, input);
    }

    public static void guessingGame(int num, Scanner input) {

        int tries = 0;

        while (true) {

            System.out.println("Enter a number: ");

            int guess = input.nextInt();

            tries++;

            if (guess > 100 || guess < 1) {
                System.out.println("Please enter a guess between 1 and 100.");
            } else {
                if (guess < num) {
                    System.out.println("Guess a higher number");
                }

                if (guess > num) {
                    System.out.println("Guess a lower number");
                }

                if (guess == num) {
                    System.out.println("Correct! Nice job!");

                    String tryortries = getTryortries(tries);

                    System.out.println("You took" + " " + tries + " " + tryortries);
                    break;
                }

            }
        }
    }
    public static String getTryortries(int tries) {
        String tryortries = " ";

        if (tries == 1) {
            tryortries = "try.";
        } else {
            tryortries = "tries";
        }
        return tryortries;
    }
}

