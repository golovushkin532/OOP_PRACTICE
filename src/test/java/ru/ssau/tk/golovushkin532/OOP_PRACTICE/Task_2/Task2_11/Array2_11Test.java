package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_11;

import org.testng.annotations.Test;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_10.Array2_10;

import static org.testng.Assert.*;

public class Array2_11Test {

    @Test
    public void testArray() {
        double[] array = Array2_11.array(20);
        assertEquals(array[0], 1.);
        assertEquals(array[1], 2.);
        assertEquals(array[2], 4.);
    }
}