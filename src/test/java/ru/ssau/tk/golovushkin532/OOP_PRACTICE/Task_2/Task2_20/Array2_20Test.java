package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_20;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_20Test {

    @Test
    public void testArray() {
        int[] massiv = new int[]{1, 2, 3, 4, 5};
        assertTrue(Array2_20.array(massiv));
        int[] massiv1 = new int[]{777, 432, 32, 342, 2};
        assertFalse(Array2_20.array(massiv1));
    }
}