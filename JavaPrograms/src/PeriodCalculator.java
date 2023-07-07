import java.util.Scanner;

public class PeriodCalculator {

    public static String periodCalculator(String date) {

        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6,10);

        int dayint = Integer.parseInt(day);
        int monthint = Integer.parseInt(month);
        int yearint = Integer.parseInt(year);

        int dayint2 = dayint;
        int monthint2 = monthint;
        int yearint2 = yearint;


        int[] daysinmonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        isLeapYear(yearint, daysinmonths);

        return addingDays(dayint, monthint, yearint, dayint2, monthint2, yearint2, daysinmonths);

    }

    private static String addingDays(int dayint, int monthint, int yearint, int dayint2, int monthint2, int yearint2,
                                     int[] daysinmonths) {
        for(int i = 0; i < 28; i++) {
            dayint ++;
            if(dayint > daysinmonths[monthint]) {
                dayint = 1;
                monthint++;
                if(monthint > 12) {
                    monthint = 1;
                    yearint++;
                }
            }
        }

        for(int i = 0; i < 32; i++) {
            dayint2 ++;
            if(dayint2 > daysinmonths[monthint]) {
                dayint2 = 1;
                monthint2++;
                if(monthint2 > 12) {
                    monthint2 = 1;
                    yearint2++;
                }
            }
        }

        String output = new String(monthint + "/" + dayint + "/" + yearint + " " + "and" + " " + monthint2 + "/" + dayint2 + "/" + yearint2);
        return output;
    }

    private static void isLeapYear(int yearint, int[] daysinmonths) {
        boolean leapyear;

        if (yearint % 100 == 0 && yearint % 400 == 0 || yearint % 100 == 0 && yearint % 4 == 0) {
            leapyear = true;
        }else {
            leapyear = false;
        }

        if (leapyear = true) {
            daysinmonths[2] = 29;
        }else {
            daysinmonths[2] = 28;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the date of your last period (mm/dd/yyyy): ");
        String date = input.nextLine();

        System.out.println ("Your next expected period is in between: " + periodCalculator(date));


    }



}


