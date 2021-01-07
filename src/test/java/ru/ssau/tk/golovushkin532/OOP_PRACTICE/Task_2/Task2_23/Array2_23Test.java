package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_23;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_23Test {

    @Test
    public void testArray() {
        int[] array = new int[]{4, 8, 15, 16, 23, 42};
        Array2_23.array(array);
        assertEquals(array[0], 42);
        assertEquals(array[5], 4);
    }
}