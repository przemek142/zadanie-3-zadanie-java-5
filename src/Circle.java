public class Circle {
    private double radius;
    private double surfaceArea;
    private double circumference;
    private final double PI = 3.1415;

    public void setRadius(double radius) {

        this.radius = radius;
        calcCircumference();
        calcSurfaceArea();
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getCircumference() {
        return circumference;
    }


    public void calcSurfaceArea() {
        surfaceArea = PI * radius * radius;
    }

    public void calcCircumference() {
        circumference = 2 * PI * radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }
}
