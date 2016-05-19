package com.adrienf.integration;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        assertEquals(Calculator.add(1, 1), 2);
    }

    @Test
    public void testSquare() throws Exception {
        assertEquals(Calculator.square(2), 4);
    }

    @Test
    public void testSub() throws Exception {
        assertEquals(Calculator.sub(2, 2), 0);
    }


}
