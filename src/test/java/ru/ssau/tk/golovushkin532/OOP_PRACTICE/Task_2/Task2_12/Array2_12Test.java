package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_12;

import org.testng.annotations.Test;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_11.Array2_11;

import static org.testng.Assert.*;

public class Array2_12Test {

    @Test
    public void testArray() {
        double[] array = Array2_12.array(14);
        assertEquals(array[0], 2.);
        assertEquals(array[1], 3.);
        assertEquals(array[2], 5.);
        assertEquals(array[3], 7.);
        assertEquals(array[4], 11.);
        assertEquals(array[5], 13.);

        double[] arrayError = Array2_12.array(1);
    }
}