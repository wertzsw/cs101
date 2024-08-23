package HW;

public class Circle {

    private int radius;

    public Circle(int radius){
        //TODO: Finish this Constructor, assigning this circle's radius
        // to the given radius
    }

    public double getCircumference(){
        //TODO: Finish this method, returning the Circumference of the Circle
        //HINT: Use Math.PI for pi
        return -1;
    }

    public double getArea(){
        //TODO: Finish this method, returning the area of the circle
        //HINT: Use Math.PI for pi
        return -1;
    }

    public void doubleRadius(){
        //TODO: Finish this method, which doubles the radius of this circle.
    }

    public void printInfo(){
        System.out.println("This is a circle of radius " + this.radius + " with area " + this.getArea() + " and circumference " + this.getCircumference());
    }
}
