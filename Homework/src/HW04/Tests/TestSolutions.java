package HW04.Tests;

import HW04.Solutions.LoopMathSol;
import org.junit.Assert;
import org.junit.Test;

public class TestSolutions {

    @Test
    public void testMultiply(){
        LoopMathSol lm = new LoopMathSol();
        Assert.assertEquals(lm.multiply(5,3),15);
        Assert.assertEquals(lm.multiply(0,6),0);
        Assert.assertEquals(lm.multiply(0,0),0);
        Assert.assertEquals(lm.multiply(12,11),132);
    }

    @Test
    public void testPow(){
        LoopMathSol lm = new LoopMathSol();
        Assert.assertEquals(lm.pow(5,3),125);
        Assert.assertEquals(lm.pow(0,6),0);
        Assert.assertEquals(lm.pow(5,0),1);
        Assert.assertEquals(lm.pow(4,2),16);
    }

    @Test
    public void testFactorial(){
        LoopMathSol lm = new LoopMathSol();
        Assert.assertEquals(lm.factorial(0),1);
        Assert.assertEquals(lm.factorial(1),1);
        Assert.assertEquals(lm.factorial(5),120);
        Assert.assertEquals(lm.factorial(6),720);
    }

    @Test
    public void testFibonacci(){
        LoopMathSol lm = new LoopMathSol();
        Assert.assertEquals(lm.fibonacci(0),0);
        Assert.assertEquals(lm.fibonacci(1),1);
        Assert.assertEquals(lm.fibonacci(2),1);
        Assert.assertEquals(lm.fibonacci(3),2);
        Assert.assertEquals(lm.fibonacci(4),3);
        Assert.assertEquals(lm.fibonacci(5),5);
        Assert.assertEquals(lm.fibonacci(6),8);
        Assert.assertEquals(lm.fibonacci(7),13);
        Assert.assertEquals(lm.fibonacci(8),21);
        Assert.assertEquals(lm.fibonacci(9),34);
        Assert.assertEquals(lm.fibonacci(10),55);
        Assert.assertEquals(lm.fibonacci(11),89);
        Assert.assertEquals(lm.fibonacci(12),144);




    }
}
