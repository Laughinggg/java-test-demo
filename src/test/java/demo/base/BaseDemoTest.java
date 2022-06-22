package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_sum1() {
        BaseDemo baseDemo = new BaseDemo();

        int a=1,b=2,expected=3;

        assertEquals(expected, baseDemo.sum(a,b));
    }
    @Test
    public void should_sum2() {
        BaseDemo baseDemo = new BaseDemo();

        int a=10,b=25,expected=35;

        assertEquals(expected, baseDemo.sum(a,b));
    }
}
