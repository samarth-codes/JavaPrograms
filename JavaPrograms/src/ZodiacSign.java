import java.util.Queue;
import java.util.Scanner;
public class ZodiacSign {
    public static int dayOfYear(String date) {

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int[] daysinmonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int monthindex = month - 1;

        int totaldays = 0;

        for (int i = 0; i < monthindex; i++) {
            totaldays = totaldays + daysinmonths[i];
        }
        totaldays = totaldays + day;
        return(totaldays);

    }
    public static String zodiacSign(String birthday) {
        String zodiacsign = " ";

        int dayofyear = dayOfYear(birthday);

        if (dayofyear > dayOfYear("03/21") && dayofyear < dayOfYear("04/19")) {
            zodiacsign = "Your sign: Aries";
            return (zodiacsign + "\nYour traits: " + "\nIndependent and strong‒willed, you are a force to be reckoned with!" +
                    " You love nothing more than an exciting new goal to tackle, and you do your best work when you’re flying" +
                    " solo. Your passion and energy keep the rest of us on our toes!");

        } else if (dayofyear > dayOfYear("04/20") && dayofyear < dayOfYear("05/20")) {
            zodiacsign = "Your sign: Taurus";
            return (zodiacsign + "\nYour traits: " + "\nAs a Taurus, you’re a wonderful combination of laid‒back " +
                    "and hard‒working. You’re honest and loyal, occasionally to a fault. Your determination and " +
                    "attention to detail will take you far in life. ");

        } else if (dayofyear > dayOfYear("05/21") && dayofyear < dayOfYear("06/20")) {
            zodiacsign = "Your sign: Gemini";
            return (zodiacsign + "\nYour traits: " + "\nYour ability to get along with a wide variety of people makes" +
                    " you a bit of a social butterfly, but you’ll take advantage of some alone time when it comes your" +
                    " way. Curious and deeply emotional, you love ritual and celebration.");

        } else if (dayofyear > dayOfYear("06/21") && dayofyear < dayOfYear("07/22")) {
            zodiacsign = "Your sign: Cancer";
            return (zodiacsign + "\nYour traits: " + "\nYour intuition is downright uncanny! You do your best socializing " +
                    "in small groups and prefer intimate relationships even if it means your social circle is on the smaller" +
                    " side. Your creative spirit will bring joy to all you meet.");

        } else if (dayofyear > dayOfYear("07/23") && dayofyear < dayOfYear("08/22")) {
            zodiacsign = "Your sign: Leo";
            return (zodiacsign + "\nYour traits: " + "\nIt’s no wonder your symbol is a lion. Your personality and presence are" +
                    " impressive to all. This may intimidate some, but your inviting spirit will help you easily make friends." +
                    " Your confidence will be an asset to you throughout your life.");

        } else if (dayofyear > dayOfYear("08/23") && dayofyear < dayOfYear("09/22")) {
            zodiacsign = "Your sign: Virgo";
            return (zodiacsign + "\nYour traits: " + "\nYou are the picture of poise and elegance. You love to stay organized and " +
                    "have a strong focus on keeping things aesthetic. But you’re not just beauty. You’ve got brains, too! You’ll " +
                    "continue seeking knowledge and intellectual growth as you age.");

        } else if (dayofyear > dayOfYear("09/23") && dayofyear < dayOfYear("10/22")) {
            zodiacsign = "Your sign: Libra";
            return (zodiacsign + "\nYour traits: " + "\nYou have a large social circle, and your open‒mindedness helps you get " +
                    "along with just about anyone. But don’t get lost in the crowd! A focus on self‒care and personal reflection" +
                    " will help you build your confidence over time. ");

        } else if (dayofyear > dayOfYear("10/23") && dayofyear < dayOfYear("11/21")) {
            zodiacsign = "Your sign: Scorpio";
            return (zodiacsign + "\nYour traits: " + "\nAs a Scorpio, you can have a sharp edge, but this isn’t always a " +
                    "negative quality. It gives you an appreciation for authenticity and a strong sense of independence. " +
                    "However, you’re not always as tough as you appear. Once you let people into your life, you’re a bit " +
                    "of a softy. ");

        } else if (dayofyear > dayOfYear("11/21") && dayofyear < dayOfYear("12/21")) {
            zodiacsign = "Your sign: Sagitarius";
            return (zodiacsign + "\nYour traits: " + "\nThe road less traveled is your favorite place to be! Your bravery " +
                    "is admirable and will make you a good fit for leadership roles. You also have a bit of an itch in your" +
                    " shoes and will always be ready to take on a new adventure. ");

        } else if ((dayofyear > dayOfYear("12/21") && (dayofyear <= dayOfYear("12/31")) || ((dayofyear >= dayOfYear("01/01") && (dayofyear < dayOfYear("01/19")))))) {
            zodiacsign = "Your sign: Capricorn";
            return (zodiacsign + "\nYour traits: " + "\nYour perfectionism and high standards, though sometimes an obstacle," +
                    " can be one of your superpowers when handled wisely. You have a strong sense of self, which enables you " +
                    "to make meaningful connections and lead the way. ");

        } else if (dayofyear > dayOfYear("01/19") && dayofyear < dayOfYear("02/18")) {
            zodiacsign = "Your sign: Aquarius";
            return (zodiacsign + "\nYour traits: " + "\nYou may fall on the introvert side of the spectrum, but that doesn’t" +
                    " mean you don’t know how to have fun. You have an enviable combination of intelligence and intuition," +
                    " and you are able to identify positive opportunities even in dark times. ");


        } else if (dayofyear > dayOfYear("02/18") && dayofyear < dayOfYear("03/20")) {
            zodiacsign = "Pisces";
            return (zodiacsign + "\nYour traits: " + "\nYou wouldn’t hurt a fly! Empathy is your superpower, and you are an " +
                    "asset to any team you join or cause you support. Your gentleness is a virtue. However, be careful to not" +
                    "let your feelings get hurt too easily. Be sure to spend time building your self‒confidence.");

        } else {
            return "Please enter a valid date!";
        }
    }

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birthday (mm/dd/yyyy): ");
        String birthday = input.next();

        System.out.println(zodiacSign(birthday));

    }


}

