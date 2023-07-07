import java.util.Scanner;
public class TimezoneConverter {

    public static void main(String[] args) {

        System.out.println("Timezone Converter");
        Scanner input = new Scanner(System.in);
        System.out.println("What timezone would you like to convert (eg. PST to EST) ");
        String whattowhat = input.nextLine();

        int index = whattowhat.indexOf(" ");
        String first = whattowhat.substring(0,index);

        int nextindex = whattowhat.indexOf(' ', index + 1);
            String next = whattowhat.substring(nextindex + 1, whattowhat.length());

        String time = "";

        switch (first) {
            case ("PST"):
                if (next.toLowerCase().equals("mst")) {
                    System.out.println("Enter your time in PST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,1));
                    break;
                }
                if (next.toLowerCase().equals("cst")) {
                    System.out.println("Enter your time in PST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,2));
                    break;
                }
                if (next.toLowerCase().equals("est")) {
                    System.out.println("Enter your time in PST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,3));
                    break;
                }
            case ("MST"):
                if (next.toLowerCase().equals("pst")) {
                    System.out.println("Enter your time in MST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,-1));
                    break;

                }
                if (next.toLowerCase().equals("cst")) {
                    System.out.println("Enter your time in MST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,1));
                    break;
                }
                if (next.toLowerCase().equals("est")) {
                    System.out.println("Enter your time in MST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,2));
                    break;
                }
            case ("CST"):
                if (next.toLowerCase().equals("pst")) {
                    System.out.println("Enter your time in CST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,-2));
                    break;
                }
                if (next.toLowerCase().equals("mst")) {
                    System.out.println("Enter your time in CST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,-1));
                    break;
                }
                if (next.toLowerCase().equals("est")) {
                    System.out.println("Enter your time in CST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,1));
                    break;
                }
            case ("EST"):
                if (next.toLowerCase().equals("pst")) {
                    System.out.println("Enter your time in EST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,-3));
                    break;
                }
                if (next.toLowerCase().equals("mst")) {
                    System.out.println("Enter your time in EST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,-2));
                    break;
                }
                if (next.toLowerCase().equals("cst")) {
                    System.out.println("Enter your time in EST (11 am): ");
                    time = input.nextLine();
                    System.out.println(getNewTime(time,-1));
                    break;
                }
        }


    }
    public static String getNewTime(String time, int hourstoadd) {

        int nextindex;
        int index;
        index = time.indexOf(" ");
        String timeextracted = time.substring(0, index);
        int timeint =Integer.parseInt(timeextracted);

        nextindex = time.indexOf(' ', index + 1);
        String timeofday = time.substring(nextindex + 1, time.length());

        int newtime = timeint + hourstoadd;

        if (newtime <= 12 && timeofday.equals("pm")) {
            timeofday = "am";
            return (newtime + timeofday);
        }
        if (newtime <= 12 && timeofday.equals("am")) {
            timeofday = "pm";
            return (newtime + timeofday);
        }
        if (newtime >= 12 && timeofday.equals("pm")) {
            newtime = newtime - 12;
            timeofday = "am";
            return (newtime + timeofday);
        }
        if (newtime >= 12 && timeofday.equals("am")) {
            newtime = newtime - 12;
            timeofday = "pm";
            return (newtime + timeofday);
        }
        return (":(");
    }
}
