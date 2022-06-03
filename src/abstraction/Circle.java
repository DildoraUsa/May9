package abstraction;

public  class Circle extends Shape{  // final abstract not
    double radius;

    public Circle(double radius) {  // if we do constructor private we cannot create object
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println(Math.PI*radius*radius);
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;

    }
  // covariant -> subtype (child type)
   // public abstract String toString();


}
