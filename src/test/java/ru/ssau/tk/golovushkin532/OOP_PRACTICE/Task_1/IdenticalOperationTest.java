package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {

    IdenticalOperation identical = new IdenticalOperation();
    private final static double DELTA = 0.0001;
    private final static double POSITIVE_INFINITY;
    private final static double NEGATIVE_INFINITY;
    private final static double ZERO;

    static {
        POSITIVE_INFINITY = 1.0 / 0.0;
        NEGATIVE_INFINITY = -1.0 / 0.0;
        ZERO = 0.0;
    }

    @Test
    public void testApply() {
        assertEquals(identical.apply(4.), 4., DELTA);
        assertEquals(identical.apply(8.), 8., DELTA);
        assertEquals(identical.apply(15.), 15., DELTA);
        assertEquals(identical.apply(16.), 16., DELTA);
        assertEquals(identical.apply(23.), 23., DELTA);
        assertEquals(identical.apply(42.), 42., DELTA);
        assertEquals(identical.apply(POSITIVE_INFINITY), POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(NEGATIVE_INFINITY), NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.apply(ZERO / ZERO), ZERO / ZERO, DELTA);
    }
    @Test
    public void  testApplyTriple () {
        assertEquals(identical.applyTriple(74.), 74., DELTA);
        assertEquals(identical.apply(POSITIVE_INFINITY), POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(NEGATIVE_INFINITY), NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.apply(ZERO / ZERO), ZERO / ZERO, DELTA);
    }
}