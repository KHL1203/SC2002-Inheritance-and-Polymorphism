import java.util.Scanner;

public class Shape2DApp
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int numShapes = scanner.nextInt();

        Shape[] shapes = new Shape[numShapes];

        // For the reference test figure: Circle (radius=10), Triangle (height=25, base=20), Rectangle (length=50, breadth=20)[cite: 20]
        for (int i = 0; i < numShapes; i++)
        {
            System.out.print("Enter shape " + (i + 1) + " type (Circle/Triangle/Rectangle): ");
            String type = scanner.next();

            switch (type)
            {
                case "Circle":
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shapes[i] = new Circle(radius);
                    break;
                case "Triangle":
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    shapes[i] = new Triangle(base, height);
                    break;
                case "Rectangle":
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = scanner.nextDouble();
                    shapes[i] = new Rectangle(length, breadth);
                    break;
                default:
                    System.out.println("Invalid shape type.");
            }
        }

        double totalArea = 0;
        for (Shape s : shapes)
        {
            double area = s.calculateArea();
            System.out.println(s.getName() + " Area: " + area);
            totalArea += area;
        }

        System.out.println("\nTotal Area of the 2-D Figure: " + totalArea);
    }
}