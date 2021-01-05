package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_10;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_10Test {
    public final static double DELTA = 0.0001;

    @Test
    public void testGeometricProgression() {
        double[] array = Array2_10.GeometricProgression(1, 2, 5);
        assertEquals(array[0], 1, DELTA);
        assertEquals(array[1], 2, DELTA);
        assertEquals(array[2], 4, DELTA);
        assertEquals(array[3], 8, DELTA);
        assertEquals(array[4], 16, DELTA);
    }
}