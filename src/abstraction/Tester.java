package abstraction;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>(); // my owen shape class
        //   Shape shape = new Shape(); // Abstract class cannot be instantiated
       // prevent instantiation - making a class abstract
       // prevent instantiation - making the constructor private
       // Utility classes with only static methods
       // Math math = new Math(); it is not work


        // Shape [] shapes1= new Shape[2];


        shapes.add(new Circle(34));
        shapes.add(new Rectangle(2,3));
        shapes.add(new Square(5));
        shapes.add(new Triangle(2,3,3,1.5));

        for (Shape shape: shapes){
            shape.calculateArea();
        }

    }
//    public static  Shape doSomeThingWithShape(Shape shape){
//
//    }
}
