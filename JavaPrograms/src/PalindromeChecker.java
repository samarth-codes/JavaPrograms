import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String args[]) {

        PalindromeChecker palindrome = new PalindromeChecker();

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your string?");
        String string = sc.next();

        palindrome.palindromeCheck(string);

    }
    public static void palindromeCheck(String string) {
        String reverse = "";

        for (int i = string.length() - 1; i >= 0; i--) { //Going the opposite way of the string
            reverse = reverse + string.charAt(i);
        }

        if (reverse.equals(string)) {
            System.out.println("This is a palindrome!");
        } else {
            System.out.println("This is not a palindrome.");
        }
        

    }
}
