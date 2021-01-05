package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_8;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_8Test {

    @Test
    public void testArray() {
        double[] integer = Array2_8.array(7);
        assertEquals(integer[0], 1.0);
        assertEquals(integer[1], 2.0);
        assertEquals(integer[2], 4.0);
        assertEquals(integer[3], 5.0);
        assertEquals(integer[4], 7.0);
        assertEquals(integer[5], 8.0);
        assertEquals(integer[6], 10.0);
    }
}