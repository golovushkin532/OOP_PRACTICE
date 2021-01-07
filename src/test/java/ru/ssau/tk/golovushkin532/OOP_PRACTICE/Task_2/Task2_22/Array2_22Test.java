package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_22;

import org.testng.annotations.Test;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_21.Array2_21;

import static org.testng.Assert.*;

public class Array2_22Test {

    @Test
    public void testArray() {
        int[] massiv = new int[]{1, 2, 3, 4};
        assertEquals(Array2_22.array(massiv, 4), 3);
        assertEquals(Array2_22.array(massiv, 2), 1);
    }
}