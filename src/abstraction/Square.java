package abstraction;

public class Square extends Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }
    public void calculateArea(){
        System.out.println(side*side);
    }
    public double calculatePerimeter(){
    return 4*side;
    }
}
