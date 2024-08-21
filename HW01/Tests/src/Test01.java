import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Test01 {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testHelloWorld(){
        HW01 h = new HW01();
        Assert.assertEquals("Hello World!", h.HelloWorld());
    }

    @Test
    public void testDoubleNum(){
        HW01 h = new HW01();
        Assert.assertEquals(10, h.doubleNum(5));
        Assert.assertEquals(14, h.doubleNum(7));
        Assert.assertEquals(18, h.doubleNum(9));
    }

    @Test
    public void testPrintSquare(){
        HW01 h = new HW01();
        h.printSquare();
        Assert.assertEquals("*****\n*****\n*****\n*****\n*****\n".replaceAll("\\n", System.lineSeparator()), outContent.toString());
    }

    @Test
    public void testAnd(){
        HW01 h = new HW01();
        Assert.assertEquals(h.and(true,true), true);
        Assert.assertEquals(h.and(true,false), false);
        Assert.assertEquals(h.and(false,true), false);
        Assert.assertEquals(h.and(false,false), false);
    }

    @Test
    public void testSquareDouble(){
        HW01 h = new HW01();
        Assert.assertEquals(h.squareDouble(5.3), 5.3*5.3,.001);
        Assert.assertEquals(h.squareDouble(4.1), 4.1*4.1,.001);
    }
}
