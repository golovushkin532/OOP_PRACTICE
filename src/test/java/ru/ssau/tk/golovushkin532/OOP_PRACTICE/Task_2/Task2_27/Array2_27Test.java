package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_27;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_27Test {

    @Test
    public void testArray() {
        assertEquals(Array2_27.array(new int[]{4, 8, 15, 16, 23, 42}), new boolean[]{true, true, false, true, false, true});
    }
}