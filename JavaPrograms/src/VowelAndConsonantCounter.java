import java.util.Scanner;

public class VowelAndConsonantCounter {

    public static void main(String args[]) {

        VowelAndConsonantCounter vowelsandconsonants = new VowelAndConsonantCounter();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your string?");

        String string = sc.next();

        System.out.println(vowelsandconsonants.count(string));

    }

    public static String count(String string) {

        int vowels  = 0;
        int consonants = 0;

        string.toLowerCase();
        

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                vowels++;
            }
            else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }

        String vowelscount = "Number of vowels: " + vowels;
        String consonantcount = "\nNumber of consonants: " + consonants;

        return (vowelscount + consonantcount);

    }
    
}
