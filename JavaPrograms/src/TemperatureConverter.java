import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {

        TemperatureConverter tempconverter = new TemperatureConverter();

        System.out.println("Temperature Converter (fahrenheit, celsius, kelvin)");
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to convert? (e.g. Fahrenheit to Celsius)");
        String  whattowhat = input.nextLine();

        System.out.print(tempconverter.extractIndex(input, whattowhat));
    }

    private static String extractIndex(Scanner input, String whattowhat) {
        int index = whattowhat.indexOf(" ");

        String first = whattowhat.substring(0,index);

        int nextindex = whattowhat.indexOf(' ', index + 1);

        String next = whattowhat.substring(nextindex + 1, whattowhat.length());

        return temperatureConversion(input, first, next);
    }

    public static String temperatureConversion(Scanner input, String first, String next) {

        if (first.toLowerCase().equals("fahrenheit") && next.toLowerCase().equals("celsius") ) {
            System.out.println("Fahrenheit: ");
            double fcfar = input.nextInt();

            double fccel = (fcfar - 32) * 5/9;

            return("Celsius: " + fccel+ "°");

        }

        if (first.toLowerCase().equals("celsius") && next.toLowerCase().equals("fahrenheit") ) {
            System.out.println("Celsius: ");
            double cfcel = input.nextDouble();

            double cffar = (cfcel * 9/5) + 32;

            return("Fahrenheit: " + cffar+ "°");

        }

        if (first.toLowerCase().equals("fahrenheit") && next.toLowerCase().equals("kelvin") ) {
            System.out.println("Fahrenheit: ");
            double fkfar = input.nextDouble();

            double fkkel = (fkfar - 32) * 5/9 + 273.15;

            return("Kelvin: " + fkkel+ "°");
        }
        if (first.toLowerCase().equals("kelvin") && next.toLowerCase().equals("fahrenheit")) {
            System.out.println("Kelvin: ");
            double kfkel = input.nextDouble();


            double kffar = (kfkel - 273.15) * 9/5 + 32;

            return("Fahrenheit: " + kffar+ "°");

        }
        if (first.toLowerCase().equals("celsius") && next.toLowerCase().equals("kelvin")) {
            System.out.println("Celsius: ");
            double ckcel = input.nextDouble();

            double ckkel = ckcel + 273.15;

            return("Kelvin: " + ckkel + "°");
        }

        if (first.toLowerCase().equals("kelvin") && next.toLowerCase().equals("celsius")) {
            System.out.println("Kelvin: ");
            double kckel = input.nextDouble();

            double kccel = kckel - 273.15;

            return("Celsius: " + kccel+ "°");
        }
        return "Sorry, cannot convert this. A tip: check your spelling.";
    }
}
