package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_14;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_14Test {

    @Test
    public void testArray() {
        int massiv[] = new int[]{1, -2, 3, -4, 5, -6, 7, -8};
        Array2_14.array(massiv);
        assertEquals((massiv[0]), -1);
        assertEquals((massiv[1]), 2);
        assertEquals(massiv[2],-3);
        assertEquals(massiv[3],4);
        assertEquals(massiv[4],-5);
        assertEquals(massiv[5],6);
        assertEquals(massiv[6],-7);
        assertEquals(massiv[7],8);
    }
}