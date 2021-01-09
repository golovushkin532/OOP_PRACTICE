package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    SqrtOperation sqr = new SqrtOperation();
    private final static double DELTA = 0.0001;

    @Test
    public void testApply() {
        assertEquals(sqr.apply(4.), 2., DELTA);
        assertEquals(sqr.apply(16.), 4., DELTA);
        assertEquals(sqr.apply(25.), 5., DELTA);
        assertEquals(sqr.apply(36.), 6., DELTA);
        assertEquals(sqr.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(sqr.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(sqr.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(sqr.applyTriple(36.), 1.5650845800732873, DELTA);
        assertEquals(sqr.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(sqr.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(sqr.apply(Double.NaN), Double.NaN, DELTA);
    }
}