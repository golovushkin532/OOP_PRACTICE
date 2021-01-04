package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {
    private static final double DELTA = 0.00001;
    IntGeneratorImpl generatorImpl = new IntGeneratorImpl();

    @Test
    public void testNextInt() {
        assertEquals(generatorImpl.nextInt(), 0, DELTA);
        assertNotEquals(generatorImpl.nextInt(), 5, DELTA);
        assertEquals(generatorImpl.nextInt(), 2, DELTA);
        assertEquals(generatorImpl.nextInt(), 3, DELTA);
    }
}