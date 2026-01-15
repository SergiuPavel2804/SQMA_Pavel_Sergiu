package com.sqma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAddTest {

    @Test
    void testAddPositiveNumbers() {
        Calculator calc = new Calculator();
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    void testAddNegativeNumbers() {
        Calculator calc = new Calculator();
        assertEquals(-1, calc.add(2, -3));
    }
}
