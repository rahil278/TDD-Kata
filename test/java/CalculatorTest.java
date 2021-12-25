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
    }
}
