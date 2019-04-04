import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '-';
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int firstOperand= 2;
        int secondOperand = 2;
        char operand = '*';
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, operand);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int firstOperand= 6;
        int secondOperand = 3;
        char operand = '/';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operand);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivsecondOperandyZero() {
        int firstOperand= 2;
        int secondOperand = 0;
        char operand = '/';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand, operand);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstOperand= 2;
        int secondOperand = 0;
        char operand = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand, operand);});
    }
}