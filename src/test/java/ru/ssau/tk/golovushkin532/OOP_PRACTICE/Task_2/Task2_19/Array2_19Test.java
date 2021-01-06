package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_19;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_19Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 7, 32, 55, 72};
        assertEquals(Array2_19.array(array),105);
        int[] array1 = new int[]{0, 7, 0, 55, 0};
        assertEquals(Array2_19.array(array1),0);
    }
}