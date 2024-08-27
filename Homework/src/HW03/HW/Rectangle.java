package HW03.HW;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getPerimeter(){
        return 2*(this.length + this.width);
    }

    public int getArea(){
        return this.length*this.width;
    }
    public void doubleDimensions(){
        this.width = 2*this.width;
        this.length = 2*this.length;
    }

    /*
    TODO: Write a method isBigger(Rectangle otherRect) that takes in a Rectangle
    TODO: and returns true if the area of this rectangle is bigger than
    TODO: the area of otherRect.
     */
    public boolean isBigger(Rectangle otherRect){
        return this.getArea() > otherRect.getArea();
    }

    public void printInfo(){
        System.out.println("This is a " + this.length + " by " + this.width + " rectangle with area " + this.getArea() + " and perimeter " + this.getPerimeter());
    }
}
