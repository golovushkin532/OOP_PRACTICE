package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_4Test {

    @Test
    public void testArray() {
        int[] array = Array2_4.array(3);
        assertEquals(array[0], 6);
        assertEquals(array[1], 4);
        assertEquals(array[2], 2);
    }
}