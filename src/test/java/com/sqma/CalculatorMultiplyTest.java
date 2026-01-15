package com.sqma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorMultiplyTest {

    @Test
    void testMultiplyPositiveNumbers() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    void testMultiplyWithZero() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.multiply(5, 0));
    }
}
