package corp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTests {
private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    public void testThatSum1CalculatedCorrectly() {
        Assertions.assertEquals(1, calculator.sum(1));
    }

    @Test
    public void testThatSum3CalculatedCorrectly() {
        Assertions.assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testThatIllegalArgumentExceptionThrownForInvalidInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0), "invalid input value 0");
    }
}