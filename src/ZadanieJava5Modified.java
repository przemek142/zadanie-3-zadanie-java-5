public class ZadanieJava5Modified {
    public static void main(String[] args) {

        double[] result = new double[2];

        ShapeCalculator calculator = new ShapeCalculator();
        Circle circle = new Circle(1.0);
        Rectangle rectangle = new Rectangle(1.0, 2.0);
        Square square = new Square(3.0);
        Triangle triangle = new Triangle(1.0, 2.0, 3.0, 4.0);

        System.out.println("Circle:");
        result = calculator.calc(circle);
        System.out.printf("  Surface area: %.2f\n  Circumference: %.2f\n", result[0], result[1]);

        System.out.println("Rectangle:");
        result = calculator.calc(rectangle);
        System.out.printf("  Surface area: %.2f\n  Circumference: %.2f\n", result[0], result[1]);

        System.out.println("Square:");
        result = calculator.calc(square);
        System.out.printf("  Surface area: %.2f\n  Circumference: %.2f\n", result[0], result[1]);

        System.out.println("Triangle:");
        result = calculator.calc(triangle);
        System.out.printf("  Surface area: %.2f\n  Circumference: %.2f\n", result[0], result[1]);


    }
}
