package HW02.src.Solutions;

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
    public void printInfo(){
        System.out.println("This is a " + this.length + " by " + this.width + " rectangle with area " + this.getArea() + " and perimeter " + this.getPerimeter());
    }
}
