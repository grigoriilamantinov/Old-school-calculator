import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatterToColumnTest {

    @Test
    void numberToDigitArray() {
        FormatterToColumn formatter = new FormatterToColumn();
        int number = 874;
        int[] expectedResult = {8,7,4};
        int[] actualResult = formatter.numberToDigitArray(number);
        assertArrayEquals (actualResult,expectedResult);
    }
}