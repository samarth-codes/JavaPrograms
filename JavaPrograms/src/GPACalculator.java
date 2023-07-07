import java.util.Scanner;
public class GPACalculator {

    public static void main(String[] args) {

        System.out.println("GPA Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("How many classes do you take? (1,2,3)");
        String classes = input.nextLine();
        int classesint = Integer.parseInt(classes);

        System.out.printf("Your GPA: %.2f", calculateGPA(input, classesint));

        }

    public static double calculateGPA(Scanner input, int classesint) {

        double gradevalue = 0;
        int num = 1;
        double totalpoints = 0;
        double totalcredits = 0;

        for (int i = 0; i < classesint; i++) {

            double coursepoints = 0;
            double creditpoints = 0;
            System.out.println("Please enter the number of credits of class " + num + ":");
            double credit = input.nextDouble();

            System.out.println("Please enter your grades for class " + num + " (Capital letters such as A,B+, C-)");
            String grade = input.nextLine();
            grade = input.next();

            switch (grade) {
                case ("A"):
                    gradevalue = 4.00;
                    break;
                case ("A-"):
                    gradevalue = 3.67;
                    break;
                case ("B+"):
                    gradevalue = 3.33;
                    break;
                case ("B"):
                    gradevalue = 3.00;
                    break;
                case ("B-"):
                    gradevalue = 2.67;
                    break;
                case ("C+"):
                    gradevalue = 2.33;
                    break;
                case ("C"):
                    gradevalue = 2.00;
                    break;
                case ("C-"):
                    gradevalue = 1.67;
                    break;
                case ("D+"):
                    gradevalue = 1.33;
                    break;
                case ("D"):
                    gradevalue = 1.00;
                    break;
                case ("F"):
                    gradevalue = 0.00;
                    break;
                default:
                    System.out.println(":(");
                    break;
            }

            coursepoints = gradevalue*credit;
            totalpoints = totalpoints + coursepoints;
            creditpoints = credit;
            totalcredits = totalcredits + creditpoints;
            num++;

        }

        double gpa = totalpoints/totalcredits;
        return (gpa);
    }
}
