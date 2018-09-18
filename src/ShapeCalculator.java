import java.lang.Math;

public class ShapeCalculator {

    private double[] result = new double[2];

    double squareArea(Square square) {
        return Math.pow(square.getA(), 2);
    }

    double circleArea(Circle cirle) {
        return Math.PI * Math.pow(cirle.getRadius(), 2);
    }

    double trianglePerimeter(Triangle triangle) {
        return triangle.getC() + triangle.getBase() + triangle.getB();
    }

    double rectPerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getA() + rectangle.getB());
    }

    public double[] calc(Circle arg) {
        arg.calcCircumference();
        arg.calcSurfaceArea();
        result[0] = arg.getCircumference();
        result[1] = arg.getSurfaceArea();
        return result;
    }

    public double[] calc(Rectangle arg) {
        arg.calcCircumference();
        arg.calcSurfaceArea();
        result[0] = arg.getCircumference();
        result[1] = arg.getSurfaceArea();
        return result;
    }

    public double[] calc(Square arg) {
        arg.calcCircumference();
        arg.calcSurfaceArea();
        result[0] = arg.getCircumference();
        result[1] = arg.getSurfaceArea();
        return result;
    }

    public double[] calc(Triangle arg) {
        arg.calcCircumference();
        arg.calcSurfaceArea();
        result[0] = arg.getCircumference();
        result[1] = arg.getSurfaceArea();
        return result;
    }
}
