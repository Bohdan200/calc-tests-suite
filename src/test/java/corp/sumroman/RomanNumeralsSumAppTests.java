package corp.sumroman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


class RomanNumeralsSumAppTests {

    @Test
    public void testThatCalculateMethodWorksOk() {
        Map<String, String> testCases = new HashMap<>();
        testCases.put("III+IV", "VII");
        testCases.put("II+II", "IV");
        testCases.put("I+X", "XI");

        testCases.forEach((expression, expected) -> {
            Assertions.assertEquals(
                    expected,
                    new RomanNumeralsSumApp().sum(expression),
                    expression
            );
        });
    }

}