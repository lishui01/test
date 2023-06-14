import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBillCalculatorTest {

    @Test
    public void testCallCostWithZeroSeconds() {
        double cost = PhoneBillCalculator.calculateCallCost(0);
        Assertions.assertEquals(0.00, cost, 0.001);
    }

    @Test
    public void testCallCostWithOneMinute() {
        double cost = PhoneBillCalculator.calculateCallCost(60);
        Assertions.assertEquals(0.05, cost, 0.001);
    }

    @Test
    public void testCallCostWithNineteenMinutes() {
        double cost = PhoneBillCalculator.calculateCallCost(19 * 60);
        Assertions.assertEquals(0.95, cost, 0.001);
    }

    @Test
    public void testCallCostWithTwentyMinutes() {
        double cost = PhoneBillCalculator.calculateCallCost(20 * 60);
        Assertions.assertEquals(1.00, cost, 0.001);
    }

    @Test
    public void testCallCostWithTwentyOneMinutes() {
        double cost = PhoneBillCalculator.calculateCallCost(21 * 60);
        Assertions.assertEquals(1.10, cost, 0.001);
    }

    @Test
    public void testCallCostWithFiftyNineMinutes() {
        double cost = PhoneBillCalculator.calculateCallCost(59 * 60);
        Assertions.assertEquals(4.90, cost, 0.001);
    }

    @Test
    public void testCallCostWithSixtyMinutes() {
        double cost = PhoneBillCalculator.calculateCallCost(60 * 60);
        Assertions.assertEquals(5.00, cost, 0.001);
    }

    @Test
    public void testCallCostWithSixtyOneMinutes() {
        double cost = PhoneBillCalculator.calculateCallCost(61 * 60);
        Assertions.assertEquals(5.10, cost, 0.001);
    }
}

