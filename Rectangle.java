public class Rectangle extends Shape
{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth)
    {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea()
    {
        return length * breadth;
    }
}
