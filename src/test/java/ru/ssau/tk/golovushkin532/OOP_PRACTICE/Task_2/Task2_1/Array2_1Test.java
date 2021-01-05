package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_1Test {
    @Test
    public void testArray() {
        Array2_1 array = new Array2_1();
        int[] testArray = new int[88];
        int[] testArray2 = new int[23];
        assertEquals(array.array(88), testArray);
        assertEquals(array.array(23), testArray2);
        assertNotEquals(array.array(14), testArray2);
    }
}