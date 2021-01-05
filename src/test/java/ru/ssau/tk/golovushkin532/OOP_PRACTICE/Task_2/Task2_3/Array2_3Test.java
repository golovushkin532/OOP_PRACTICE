package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_3Test {

    @Test
    public void testArray() {
        int[] firstArray = Array2_3.array(6);
        assertEquals(firstArray[0], 1);
        assertEquals(firstArray[1], 3);
        assertEquals(firstArray[2], 5);
        assertEquals(firstArray[3], 7);
        assertEquals(firstArray[4], 9);
        assertEquals(firstArray[5], 11);
    }
}