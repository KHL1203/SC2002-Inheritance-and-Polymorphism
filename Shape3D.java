public abstract class Shape3D {
    protected String name;

    public Shape3D(String name) {
        this.name = name;
    }

    public abstract double getVolume();

    public String getName() {
        return name;
    }
}