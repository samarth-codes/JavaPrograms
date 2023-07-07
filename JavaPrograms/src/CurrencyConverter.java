import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        CurrencyConverter currencyconverter = new CurrencyConverter();

        System.out.println("Currency Converter (Dollars, Rupees, Euros)");
        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to convert?");
        String whattowhat = input.nextLine();

        extractIndex(input, whattowhat);

    }
    public static void extractIndex(Scanner input, String whattowhat) {
        int index = whattowhat.indexOf(" ");

        String first = whattowhat.substring(0, index);

        int nextindex = whattowhat.indexOf(' ', index + 1);

        String next = whattowhat.substring(nextindex + 1, whattowhat.length());

        System.out.println(currencyConversion(input, first, next));
    }

    public static String currencyConversion(Scanner input, String first, String next) {
        if (first.toLowerCase().equals("dollars") && next.toLowerCase().equals("rupees")) {
            System.out.println("Enter amount of dollars: ");
            double drd = input.nextDouble();
            double drr = drd * 82.2829;

            return ("Rupees: " + drr);
        }
        if (first.toLowerCase().equals("rupees") && next.toLowerCase().equals("dollars")) {
            System.out.println("Enter amount of rupees: ");
            double rdr = input.nextDouble();
            double rdd = rdr / 82.2829;

            return ("Dollars: " + rdd);
        }
        if (first.toLowerCase().equals("rupees") && next.toLowerCase().equals("euros")) {
            System.out.println("Enter amount of rupees: ");
            double rer = input.nextDouble();
            double ree = rer / 90.9090909091;

            return ("Euros: " + ree);
        }
        if (first.toLowerCase().equals("euros") && next.toLowerCase().equals("rupees")) {
            System.out.println("Enter amount of euros: ");
            double ere = input.nextDouble();
            double err = ere * 90.9090909091;

            return ("Rupees: " + err);
        }
        if (first.toLowerCase().equals("dollars") && next.toLowerCase().equals("euros")) {
            System.out.println("Enter amount of dollars: ");
            double ded = input.nextDouble();
            double dee = ded / 1.0752688172;

            return ("Euros: " + dee);
        }
        if (first.toLowerCase().equals("euros") && next.toLowerCase().equals("dollars")) {
            System.out.println("Enter amount of euros: ");
            double ede = input.nextDouble();
            double edd = ede * 1.0752688172;

            return ("Dollars: " + edd);
        }
        return "Sorry! Cannot convert this. Tip: check your spelling.";
    }
}
