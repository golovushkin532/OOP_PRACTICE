package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {

    IdenticalOperation identical = new IdenticalOperation();
    private final static double DELTA = 0.0001;

    @Test
    public void testApply() {
        assertEquals(identical.apply(4.), 4., DELTA);
        assertEquals(identical.apply(8.), 8., DELTA);
        assertEquals(identical.apply(15.), 15., DELTA);
        assertEquals(identical.apply(16.), 16., DELTA);
        assertEquals(identical.apply(23.), 23., DELTA);
        assertEquals(identical.apply(42.), 42., DELTA);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(74.), 74., DELTA);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NaN), Double.NaN, DELTA);
    }
}