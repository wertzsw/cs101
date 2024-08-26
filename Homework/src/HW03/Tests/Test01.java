package HW03.Tests;

import HW03.HW.Circle;
import HW03.HW.Rectangle;
import HW03.HW.SyntaxPractice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test01 {

    @Test
    public void testIsVar1Greater(){
        SyntaxPractice sp = new SyntaxPractice(5,8);
        Assert.assertFalse(sp.isVar1Greater());
    }

    @Test
    public void testAllSyntaxPractice(){
        SyntaxPractice sp = new SyntaxPractice(5,8);
        Assert.assertFalse(sp.isVar1Greater());
        sp.swap();
        Assert.assertTrue(sp.isVar1Greater());
    }

    @Test
    public void testIsBigger(){
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(3,6);
        Assert.assertTrue(r1.isBigger(r2));
        Assert.assertFalse(r2.isBigger(r1));
        Assert.assertFalse(r1.isBigger(r1));
    }

    @Test
    public void testIsLonger(){
        Circle c1 = new Circle(6);
        Circle c2 = new Circle(5);
        Assert.assertTrue(c1.isLonger(c2));
        Assert.assertFalse(c1.isLonger(c1));
        Assert.assertFalse(c2.isLonger(c2));
    }
}
