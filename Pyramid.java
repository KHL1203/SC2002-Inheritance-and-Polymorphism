public class Pyramid extends Shape{
    private double base;
    private double height;

    public Pyramid(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        double slantHeight = Math.sqrt((height * height) + ((base / 2.0) * (base / 2.0)));
        double baseArea = base * base;
        double lateralArea = 4 * (0.5 * base * slantHeight);
        return baseArea + lateralArea;
    }
}