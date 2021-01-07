package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_24;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_24Test {

    @Test
    public void testArray() {
        int[] array = new int[]{4, 8, 15, 16, 23, 42};
        Array2_24.array(array);
        assertEquals(array[0], -5);
        Array2_24.array(array);
        assertEquals(array[0], 4);
    }
}