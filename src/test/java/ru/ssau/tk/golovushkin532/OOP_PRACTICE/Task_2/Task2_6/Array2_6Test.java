package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_6;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_6Test {

    @Test
    public void testArray() {
        int[] pow = Array2_6.array(7);
        assertEquals(pow[0], 0);
        assertEquals(pow[1], 1);
        assertEquals(pow[2], 4);
        assertEquals(pow[3], 9);
        assertEquals(pow[4], 16);
        assertEquals(pow[5], 25);
        assertEquals(pow[6], 36);
    }
}