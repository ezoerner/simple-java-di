package simplejavadi;

import calculator.RandomModifier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateLuckyNumberTest {

    // You can extend the CalculatorModule to create a test module,
    // e.g. to create test doubles
    final CalculatorModule testModule = new CalculatorModule() {
        @Override
        public RandomModifier getRandomModifier() {
            return randomModifier.get(() ->
                new RandomModifier() {
                    @Override
                    public int next() {
                        return 10;
                    }
                });
        }
    };

    @Test
    public void testLuckyNumber() {
        final int result = testModule.getCalculateLuckyNumber().calculate(15, "red");
        assertEquals(15 + 3 + 10, result);
    }
}
