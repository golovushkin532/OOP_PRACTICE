package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_21;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_21Test {
    @Test
    public void testArray() {
        assertEquals(Array2_21.array(new int[]{1, 2, 3, 4, 5, 5, 6}), 5);
        assertEquals(Array2_21.array(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 4}), 4);
    }
}