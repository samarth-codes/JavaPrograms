
import java.util.Scanner;

public class TwoDigitCalculator {

    public static String twoDigitCalculator(double num1, double num2, char operator) {

        double result = 0;

        switch (operator) { //switch case

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;
        }

        String output = new String(num1 + " " + operator + " " + num2 + " " + "=" + " " + result);

        return output;
    }

    public static void main(String[] args) {

        TwoDigitCalculator calculator = new TwoDigitCalculator(); //creating an object

        Scanner input = new Scanner(System.in);

        System.out.println("Number 1: ");
        double num1 = input.nextDouble();

        System.out.println("Number 2: ");
        double num2 = input.nextDouble();

        System.out.println("Operator (+,-,*,/): ");
        char operator = input.next().charAt(0);

        System.out.println("Your answer:" + " " + calculator.twoDigitCalculator(num1, num2, operator));

    }

}
