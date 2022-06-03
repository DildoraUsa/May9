package abstraction;

public class Triangle extends Shape {
    double base;
    double sideA;
    double sideB;
    double height;

    public Triangle(double base, double sideA, double sideB, double height) {
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println(base * height / 2);
    }

    public double calculatePerimeter() {
        return base * (sideA + sideB);
    }
}
