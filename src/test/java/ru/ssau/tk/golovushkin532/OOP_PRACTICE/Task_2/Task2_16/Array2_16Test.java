package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_16;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_16Test {

    @Test
    public void testArray() {
        Integer[] massiv = new Integer[4];
        massiv[0] = 1;
        massiv[1] = null;
        massiv[2] = 3;
        assertTrue(Array2_16.array(massiv));
    }
}