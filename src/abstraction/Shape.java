package abstraction;

public abstract class Shape {

    // Encapsulation -> data hiding ( variables )
    // Abstraction ->
    private String color;   // we can't abstract variable
    private boolean isFilled;

    protected Shape(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
  // Provides calculation of the area of the shape
    public abstract void calculateArea();  // abstract class can be

     /*
     Provides calculation of the perimeter of the shape
      */

    public abstract double calculatePerimeter();  // only public, and protected visibility

     public String toString(){  // regulary method
         return this.color+this.isFilled;
     }

}
