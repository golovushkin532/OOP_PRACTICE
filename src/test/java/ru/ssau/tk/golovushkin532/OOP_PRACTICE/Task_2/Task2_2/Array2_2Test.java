package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_2Test {

    @Test
    public void testArray() {
        int[] firstArray = Array2_2.array(9);
        assertEquals(firstArray.length, 9);
        assertEquals(firstArray[8], 2);
        assertEquals(firstArray[7], 1);
        assertEquals(firstArray[6], 1);
        assertEquals(firstArray[5], 1);
        assertEquals(firstArray[4], 1);
        assertEquals(firstArray[3], 1);
        assertEquals(firstArray[2], 1);
        assertEquals(firstArray[1], 1);
        assertEquals(firstArray[0], 2);
    }
}