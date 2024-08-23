package HW;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int length, int width){
        //TODO: Finish this Constructor, assigning this rectangle's width
        // to the given width and its length to the given length
    }

    public int getPerimeter(){
        //TODO: Finish this method, returning the perimeter of the rectangle
        return -1;
    }

    public int getArea(){
        //TODO: Finish this method, returning the area of the rectangle
        return -1;
    }

    public void doubleDimensions(){
        //TODO: Finish this method which should double the length and width of this rectangle

    }
    public void printInfo(){
        System.out.println("This is a " + this.length + " by " + this.width + " rectangle with area " + this.getArea() + " and perimeter " + this.getPerimeter());
    }
}
