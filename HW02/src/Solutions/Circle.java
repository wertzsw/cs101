package Solutions;

public class Circle {

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getCircumference(){
        return Math.PI*2*this.radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public void doubleRadius(){
        this.radius = 2*this.radius;
    }

    public void printInfo(){
        System.out.println("This is a circle of radius " + this.radius + " with area " + this.getArea() + " and circumference " + this.getCircumference());
    }
}
