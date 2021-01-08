package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_26;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_26Test {

    @Test
    public void testArray() {
        assertEquals(Array2_26.array(new int[]{1, 2, 3, 4}), new int[]{3, 7});
        assertEquals(Array2_26.array(new int[]{1, 2, 3, 4, 5}), new int[]{3, 7, 5});
    }
}