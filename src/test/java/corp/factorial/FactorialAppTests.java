package corp.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialAppTests {
    @Test
    public void testThat0InputHandledCorrectly() {
        long actual = new FactorialApp().calc(0);

        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testThat1InputHandledCorrectly() {
        Assertions.assertEquals(1, new FactorialApp().calc(1));
    }

    @Test
    public void testThat2InputHandledCorrectly() {
        Assertions.assertEquals(2, new FactorialApp().calc(2));
    }

    @Test
    public void testThat12InputHandledCorrectly() {
        Assertions.assertEquals(479001600, new FactorialApp().calc(12));
    }

    @Test
    public void testThat18InputHandledCorrectly() {
        Assertions.assertEquals(6402373705728000L, new FactorialApp().calc(18));
    }

    @Test
    public void testThatNegativeInputHandledCorrectly() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new FactorialApp().calc(-1));
    }

    @Test
    public void testThatTooBigInputHandledCorrectly() {
        int maxNumber = 20;
        Assertions.assertThrows(IllegalArgumentException.class, () -> new FactorialApp().calc(maxNumber + 1));
    }
}
