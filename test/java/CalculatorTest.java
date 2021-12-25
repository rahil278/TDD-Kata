import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorTest {
    @Test
    public void testAddCase1() {
        Calculator cal = new Calculator();
        int res;

        // subcase 1
        res = cal.Add("");
        assertTrue(res == 0);

        // subcase 2
        res = cal.Add("1");
        assertTrue(res == 1);

        // subcase 3
        res = cal.Add("1,2");
        assertTrue(res == 3);
    }

    @Test
    public void testAddCase2() {
        Calculator cal = new Calculator();
        int res;

        res = cal.Add("1,2,3");
        assertTrue(res == 6);

        res = cal.Add("1,2,3,4");
        assertTrue(res == 10);
    }

    @Test
    public void testAddCase3() {
        Calculator cal = new Calculator();
        int res;

        res = cal.Add("1\n2,3");
        assertTrue(res == 6);

        res = cal.Add("1,2\n3,4");
        assertTrue(res == 10);
    }

    @Test
    public void testAddCase4() {
        Calculator cal = new Calculator();
        int res;

        res = cal.Add("//;\n1;2\n3");
        assertTrue(res == 6);

        res = cal.Add("//#\n1#2#3#4");
        assertTrue(res == 10);
    }
}
