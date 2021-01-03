package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    TangentOperation tangent = new TangentOperation();
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
        assertEquals(tangent.apply(4.), 1.1578212823495775, DELTA);
        assertEquals(tangent.apply(8.), -6.799711455220379, DELTA);
        assertEquals(tangent.apply(POSITIVE_INFINITY), ZERO/ZERO, DELTA);
        assertEquals(tangent.apply(NEGATIVE_INFINITY), ZERO/ZERO, DELTA);
        assertEquals(tangent.apply(ZERO/ZERO), ZERO/ZERO, DELTA);
    }
    @Test
    public void  testApplyTriple (){
        assertEquals(tangent.applyTriple(36.), 0.20430147217043396, DELTA);
        assertEquals(tangent.apply(POSITIVE_INFINITY), ZERO/ZERO, DELTA);
        assertEquals(tangent.apply(NEGATIVE_INFINITY), ZERO/ZERO, DELTA);
        assertEquals(tangent.apply(ZERO/ZERO), ZERO/ZERO, DELTA);
    }
}