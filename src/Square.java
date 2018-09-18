public class Square {
    private double a;
    private double surfaceArea;
    private double circumference;

    public void setA(double a) {
        this.a = a;
        calcCircumference();
        calcSurfaceArea();
    }

    public double getA() {
        return a;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getCircumference() {
        return circumference;
    }


    public void calcSurfaceArea() {
        surfaceArea = a * a;
    }

    public void calcCircumference() {
        circumference = 4 * a;
    }

    public Square(double a) {
        setA(a);
    }
}
