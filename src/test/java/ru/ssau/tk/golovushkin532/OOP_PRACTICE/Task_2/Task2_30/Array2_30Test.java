package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_30;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_30Test {

    @Test
    public void testArray() {
        assertEquals(Array2_30.array(3), new int[][]{{1, 2, 3}, {4, 5}, {6}});
    }
}