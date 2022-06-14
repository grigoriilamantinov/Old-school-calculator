import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void calcMinus() {
        int a = 8;
        int b = 4;
        int expectedResult = 4;
        int actualResult = calculator.subtraction(a,b);
        assertEquals(actualResult,expectedResult);
    }

    @Test
    void calcPlus() {
        int a = 8;
        int b = 4;
        int expectedResult = 12;
        int actualResult = calculator.addition(a,b);
        assertEquals(actualResult,expectedResult);
    }

    @Test
    void calcDiv() {
        int a = 8;
        int b = 4;
        int expectedResult = 2;
        int actualResult = calculator.division(a,b);
        assertEquals(actualResult,expectedResult);
    }
}