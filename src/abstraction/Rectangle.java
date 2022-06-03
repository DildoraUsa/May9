package abstraction;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void calculateArea(){
        System.out.println(width*height);
    }
    public double calculatePerimeter(){
        return 2*(width+height);
    }
}
