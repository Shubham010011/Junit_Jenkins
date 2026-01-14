package com.tyit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculaterTest {

    @Test
    public void testAddition() {
        Calculator c = new Calculator();
        assertEquals(10, c.add(5, 5));
    }
}

