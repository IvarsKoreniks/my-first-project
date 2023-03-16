import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {


    @Test
    public void testSum () {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.sum(10, 50),60);
    }

    @Test
    public void testSubtract () {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.subtract(30, 10),20);
    }

    @Test
    public void testDivide () {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.divide(10, 2),5);
    }

    @Test
    public void testMultiply () {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.multiply(10, 5),50);
    }

}
