public class Triangle {
    private double base;
    private double b;
    private double c;
    private double h;

    private double surfaceArea;
    private double circumference;

    private void calcForSetters() {
        calcCircumference();
        calcSurfaceArea();
    }

    public void setBase(double base) {
        this.base = base;
        calcForSetters();
    }

    public double getBase() {
        return base;
    }

    public void setH(double h) {
        this.h = h;
        calcForSetters();
    }

    public void setB(double b) {
        this.b = b;
        calcForSetters();
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.h = c;
        calcForSetters();
    }

    public double getC() {
        return c;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getCircumference() {
        return circumference;
    }

    public void calcSurfaceArea() {
        surfaceArea = 0.5 * base * h;
    }

    public void calcCircumference() {
        circumference = base + b + c;
    }

    public Triangle(double base, double h, double b, double c) {
        setB(b);
        setH(h);
        setBase(base);
        setC(c);
    }
}
