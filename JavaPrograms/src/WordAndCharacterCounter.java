import java.util.Scanner;
public class WordAndCharacterCounter {

    public static void main(String[] args)  {

        WordAndCharacterCounter wccounter = new WordAndCharacterCounter();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String essay = input.nextLine();


        System.out.println("Would you like to count the amount of characters or the amount of words? (c/w)");
        char charorwords = input.next().charAt(0);

        if (charorwords == 'c') {
            System.out.println(wccounter.charCount(essay));

        }
        else if (charorwords == 'w'){
            System.out.println(wccounter.wordCount(essay));
        }
    }

    public static String wordCount(String essay) {
        int wordcount = 1;


        for (int i = 0; i < essay.length() - 1; i++) {
            if (essay.charAt(i) == ' ' && essay.charAt(i+1) != ' ') {
                wordcount ++;
            }
        }

        String wordcountoutput = ("Number of words: " + wordcount);

        return wordcountoutput;
    }

    public static String charCount(String essay) {

        int charcount = 0;
        for (int i = 0; i < essay.length(); i++) {
            charcount ++;
        }

        String charcountoutput = ("Number of characters: " + charcount );

        return charcountoutput;

    }
}

