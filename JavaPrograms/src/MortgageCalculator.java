import java.util.Scanner;

public class MortgageCalculator {

    public static String mortgageCalculator(double principal, float annualInterestRate, int termInYears) {

        float monthlyInterestRate = annualInterestRate / 12;
        int numberOfPayments = termInYears * 12;

        double monthlyPayment = principal * ( (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) /
                ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1));

        String output = new String("$" + monthlyPayment);
        return output;
    }

    public static void main(String[] args) {

        MortgageCalculator mortgagecalc = new MortgageCalculator();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal amount ($) : ");
        double principal = input.nextDouble();

        System.out.println("Enter the annual interest rate (0.00): ");
        float annualInterestRate = input.nextFloat();

        System.out.println("Enter the term in years: ");
        int termInYears = input.nextInt();

        System.out.println ("Your monthly payment: " + mortgagecalc.mortgageCalculator(principal, annualInterestRate, termInYears));

    }

}
