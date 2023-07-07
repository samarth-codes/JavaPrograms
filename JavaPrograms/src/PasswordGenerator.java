import java.util.Scanner;
import java.util.Random;
public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How long do you want your password to be (__ characters): ");
        int passwordlength = scanner.nextInt();

        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = uppercase.toLowerCase();
        String numbers = "123456789";
        String special = "!@#$%^&*()";
        String combined = uppercase + lowercase + numbers + special;

        String password = generatePassword(combined, passwordlength);
        System.out.println("Your password is: " + password);
    }

    public static String generatePassword(String combined, int passwordlength) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordlength; i++) {
            int index = random.nextInt(combined.length());
            char character = combined.charAt(index);
            password.append(character);
        }

        return password.toString();
    }
}