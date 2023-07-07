import java.util.Scanner;

public class AddingDaysToDate {

    public static void isLeapYear(int yearint, int[] daysinmonths) {

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
    public static String addingDays(int dayint, int monthint, int yearint, int daystoaddint, int[] daysinmonths) {
        for(int i = 0; i < daystoaddint; i++) {
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

        String output = new String(monthint + "/" + dayint + "/" + yearint);
        return output;
    }
    public static String dateAdder(String date, String daystoadd) {

        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6,10);

        int dayint = Integer.parseInt(day);
        int monthint = Integer.parseInt(month);
        int yearint = Integer.parseInt(year);

        int daystoaddint = Integer.parseInt(daystoadd);

        int[] daysinmonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        isLeapYear(yearint, daysinmonths);

        return addingDays(dayint, monthint, yearint, daystoaddint, daysinmonths);

    }

    public static void main(String[] args) {

        AddingDaysToDate addingdays = new AddingDaysToDate();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a date (mm/dd/yyyy): ");
        String date = input.nextLine();

        System.out.println("How many days do you want to add to that date?");
        String daystoadd = input.nextLine();

        System.out.println ("Your new date: " + addingdays.dateAdder(date, daystoadd));

    }



}


