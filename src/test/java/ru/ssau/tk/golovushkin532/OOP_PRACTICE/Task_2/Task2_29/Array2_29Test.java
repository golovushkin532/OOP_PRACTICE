package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_29;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_29Test {

    @Test
    public void testArray() {
        int[] massiv = Array2_29.array(5, 2);
        assert massiv != null;
        assertEquals(massiv[0], 4);
        assertEquals(massiv[1], 5);
        assertEquals(massiv[2], 1);
        assertEquals(massiv[3], 2);
        assertEquals(massiv[4], 3);
    }
}