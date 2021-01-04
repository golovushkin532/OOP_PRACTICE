package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    private static final double DELTA = 0.00001;
    ResettableIntGenerator generator = new ResettableIntGenerator();

    @Test
    public void testNextInt() {
        assertEquals(generator.nextInt(), 0, DELTA);
        assertNotEquals(generator.nextInt(), 5, DELTA);
        assertEquals(generator.nextInt(), 2, DELTA);
        assertEquals(generator.nextInt(), 3, DELTA);
    }

    @Test
    public void testReset() {
        assertEquals(generator.nextInt(), 4);
        generator.reset();
        assertEquals(generator.nextInt(), 0);
    }
}