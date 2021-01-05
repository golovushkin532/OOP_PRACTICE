package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_9;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_9Test {
    public final static double DELTA = 0.0001;

    @Test
    public void testProgression() {
        double[] array = Array2_9.progression(5, 3, 2);
        assertEquals(array[0], 3, DELTA);
        assertEquals(array[1], 5, DELTA);
        assertEquals(array[2], 7, DELTA);
        assertEquals(array[3], 9, DELTA);
        assertEquals(array[4], 11, DELTA);
    }
}