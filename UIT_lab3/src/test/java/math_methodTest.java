import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class math_methodTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Start project");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("End project");
    }

    @Test
    public void multiply() {
        math_method number = new math_method();
        int test_result = number.multiply(20,10);
        int expected_result = 200;
        assertEquals(expected_result, test_result);
    }
}