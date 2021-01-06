package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_17;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_17Test {

    @Test
    public void testArray() {
        int[] massiv = new int[10];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i;
        }
        assertEquals(Array2_17.array(massiv), 5);
    }
}
