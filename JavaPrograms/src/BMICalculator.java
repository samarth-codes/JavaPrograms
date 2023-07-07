import java.util.Scanner;
public class BMICalculator {

    public static void main(String[] args) {
        //The formula for BMI is weight in kilograms divided by height in meters squared.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight (pounds): ");
        double weight = input.nextDouble();

        System.out.println("Enter your height (feet): ");
        int feet = input.nextInt();

        System.out.println("Enter your height (inches): ");
        double inches = input.nextDouble();

        double height = (feet*12) + inches;
        double kilos = weight * 0.45359237;
        double meters = height/39.37;

        System.out.println(calculateBMI(kilos, meters));

    }
    public static String calculateBMI(double kilos, double meters) {

        double bmi = kilos/(meters*meters);

        String underweight = "You are underweight.";
        String normal = "You are normal.";
        String overweight = "You are overweight";
        String obese = "You are obese";

        if (bmi < 18.5) {
            return ("Your BMI: " + bmi + "\nStatus: " + underweight);
        } else if (bmi > 18.5 && bmi < 24.9) {
            return ("Your BMI: " + bmi + "\nStatus: " + normal);
        } else if (bmi > 24.9 && bmi < 29.9) {
            return ("Your BMI: " + bmi + "\nStatus: " + overweight);
        } else if (bmi > 29.9) {
            return ("Your BMI: " + bmi + "\nStatus: " + obese);
        }
        return ":(";
    }
}
