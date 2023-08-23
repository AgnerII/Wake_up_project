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
        assertEquals(10,calculator.add(6,4));
    }
    @RepeatedTest(1)
    void testAddWithNegative(){
        assertEquals(7,calculator.add(-5,12));
    }

}