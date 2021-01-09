package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_34;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_34Test {

    @Test
    public void testArray() {
        assertEquals(Array2_34.array(new Double[]{6., Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY}).doubleValue(), 12.);
    }
}