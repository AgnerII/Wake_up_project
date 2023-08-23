import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
            void setUp(){
        calculator = new Calculator();
    }
    @Test
    void testAdd(){
        assertEquals(100,calculator.add(64,36));
    }
    @RepeatedTest(1)
    void testAddWithNegative(){
        assertEquals(7,calculator.add(-5,12));
    }

    void testSubtract(){assertEquals(-14,calculator.subtract(-7,-7));}

    @Test
    void testMultiply(){
        assertEquals(20,calculator.multiply(4,5));
    }
    @RepeatedTest(2)
    void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(7, 0));
        assertEquals(0,calculator.multiply(0,7));

    }
    void testDivide() {
        assertEquals(8,calculator.divide(32,4));
    }
}