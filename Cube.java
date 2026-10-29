public class Cube extends Shape3D {
    private double sideLength;

    public Cube(double sideLength) {
        super("Cube");
        this.sideLength = sideLength;
    }

    @Override
    public double getVolume() {
        return sideLength * sideLength * sideLength;
    }
}