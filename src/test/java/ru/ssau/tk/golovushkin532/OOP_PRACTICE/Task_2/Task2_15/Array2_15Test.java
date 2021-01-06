package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_15;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_15Test {

    @Test
    public void testArray() {
        int[] massiv = {1, 2, 3, 4, 5};
        assertTrue(Array2_15.array(massiv, 1));
        assertFalse(Array2_15.array(massiv, 6));
        assertTrue(Array2_15.array(massiv, 4));
        assertFalse(Array2_15.array(massiv, 10));
    }
}