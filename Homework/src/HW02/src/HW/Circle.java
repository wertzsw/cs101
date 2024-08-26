package HW02.src.HW;

public class Circle {

    private int radius;

    public Circle(int radius){
        //TODO: Finish this Constructor, assigning this circle's radius
        // to the given radius
        this.radius = radius;
    }

    public double getCircumference(){
        //TODO: Finish this method, returning the Circumference of the Circle
        //HINT: Use Math.PI for pi
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        //TODO: Finish this method, returning the area of the circle
        //HINT: Use Math.PI for pi
        int radiusSqaured = radius * radius;
        return Math.PI * radiusSqaured;
    }

    public void doubleRadius(){
        //TODO: Finish this method, which doubles the radius of this circle.
        this.radius = 2 * radius;
    }

    public void printInfo(){
        System.out.println("This is a circle of radius " + this.radius + " with area " + this.getArea() + " and circumference " + this.getCircumference());
    }
}
