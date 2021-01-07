package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_25;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_25Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 2, 3};
        int[] newArray = Array2_25.array(array);
        assertEquals(newArray[0], -2);
        assertEquals(newArray[1], -3);
    }
}