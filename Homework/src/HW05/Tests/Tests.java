package HW05.Tests;

import HW05.HW.ListFunctions;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testCharArrToString(){
        ListFunctions lf = new ListFunctions(null);
        char[] c1 = {'a','b','c','d'};
        Assert.assertEquals("abcd", lf.charArrToString(c1));
        char[] c2 = {'S','e','t','h'};
        Assert.assertEquals("Seth",lf.charArrToString(c2));
    }

    @Test
    public void testReverse1(){
        ListFunctions lf = new ListFunctions(null);
        int[] a1 = {1,2,3,4};
        int[] a2 = {4,3,2,1};
        Assert.assertArrayEquals(a2, lf.reverse(a1));
        Assert.assertArrayEquals(a1, lf.reverse(lf.reverse(a1)));
    }

    @Test
    public void testReverse2(){
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {5,4,3,2,1};
        ListFunctions lf = new ListFunctions(a1);
        lf.reverse();
        Assert.assertArrayEquals(lf.arr,a2);
        lf.reverse();
        Assert.assertArrayEquals(lf.arr,a1);

    }

    @Test
    public void testLargest(){
        int[] a1 = {1,6,3,9,2};
        ListFunctions lf = new ListFunctions(null);
        Assert.assertEquals(lf.largest(a1),9);
        
    }
}
