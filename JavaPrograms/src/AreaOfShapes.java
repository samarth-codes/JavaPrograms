import java.util.Scanner;
public class AreaOfShapes {

    public static void main(String[] args) {

        System.out.println("Area of Shapes (circle, square, triangle, rectangle)");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your shape: ");
        String shape = input.nextLine();

        System.out.println(areaofShape(input, shape));




    }
    public static String areaofShape(Scanner input, String shape) {
        if (shape.toLowerCase().equals("circle")) {
            System.out.println("Radius: ");
            double r = input.nextDouble();
            double π = 3.14;
            double aoc = π * (r * r);

            return("Area of Circle: " + aoc);
        }
        if (shape.toLowerCase().equals("square")) {
            System.out.println("Side: ");
            double s = input.nextDouble();
            double aos = s * s;

            return("Area of Square: " + aos);
        }
        if (shape.toLowerCase().equals("triangle")) {
            System.out.println("Base: ");
            double b = input.nextDouble();
            System.out.println("Height: ");
            double h = input.nextDouble();
            double aot = (h * b) / 2;

            return("Area of Triangle: " + aot);
        }
        if (shape.toLowerCase().equals("rectangle")) {
            System.out.println("Width: ");
            double width = input.nextDouble();
            System.out.println("Height: ");
            double height = input.nextDouble();
            double aor = (width * height);

            return("Area of Rectangle: " + aor);

        }

        return ("Please enter a circle, square, rectangle, or triangle.");
    }
}
