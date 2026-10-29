import java.util.Scanner;

public class Shape3DApp{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of 3D shapes: ");
        int numShapes = scanner.nextInt();

        Shape3D[] shapes = new Shape3D[numShapes];

        for (int i = 0; i < numShapes; i++) {
            System.out.print("Enter the type of shape (Sphere, Cube, Cylinder): ");
            String shapeType = scanner.next();

            switch (shapeType.toLowerCase()) {
                case "sphere":
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    shapes[i] = new Sphere(radius);
                    break;
                case "cube":
                    System.out.print("Enter the side length: ");
                    double sideLength = scanner.nextDouble();
                    shapes[i] = new Cube(sideLength);
                    break;
                case "cylinder":
                    System.out.print("Enter the radius: ");
                    double cylRadius = scanner.nextDouble();
                    System.out.print("Enter the height: ");
                    double height = scanner.nextDouble();
                    shapes[i] = new Cylinder(cylRadius, height);
                    break;
                default:
                    System.out.println("Invalid shape type. Please try again.");
                    i--; // Decrement to repeat this iteration
            }
        }

        // Display the volume of each shape
        for (Shape3D shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " Volume: " + shape.getVolume());
        }
    }
}