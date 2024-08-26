package HW02.src.Tests;

import HW02.src.HW.Rectangle;
import HW02.src.HW.Circle;
import org.junit.*;


public class Test01 {



    @Test
    public void testRectangleArea(){
        Rectangle r1 = new Rectangle(2,7);
        Assert.assertEquals(r1.getArea(), 14);

    }

    @Test
    public void testRectanglePerimeter(){
        Rectangle r1 = new Rectangle(2,7);
        Assert.assertEquals(r1.getPerimeter(),18);

    }

    @Test
    public void testRectangleDoubling(){
        Rectangle r1 = new Rectangle(2,7);
        r1.doubleDimensions();
        Assert.assertEquals(r1.getArea(), 56);
        Assert.assertEquals(r1.getPerimeter(),36);
    }

    @Test
    public void testCircleArea(){
        Circle c1 = new Circle(5);
        Assert.assertEquals(c1.getArea(), 25*Math.PI, 0.01);

    }

    @Test
    public void testCircleCircumference(){
        Circle c1 = new Circle(5);
        Assert.assertEquals(c1.getCircumference(), 10*Math.PI, 0.01);
    }

    @Test
    public void testCircleDoubling(){
        Circle c1 = new Circle(5);
        c1.doubleRadius();
        Assert.assertEquals(c1.getCircumference(), 20*Math.PI, 0.01);
        Assert.assertEquals(c1.getArea(), 100*Math.PI, 0.01);
    }
}
