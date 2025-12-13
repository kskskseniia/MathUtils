package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void addWorks() {
        assertEquals(4, MathUtils.add(2, 2));
        assertEquals(0, MathUtils.add(-1, 1));
    }

    @Test
    void factorialWorks() {
        assertEquals(1, MathUtils.factorial(0));
        assertEquals(120, MathUtils.factorial(5));
    }

    @Test
    void factorialThrowsOnNegative() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }
}