package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_32;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_32Test {

    @Test
    public void testArray() {
        Double[] massiv = new Double[]{1., 2., 3., Double.NaN};
        Array2_32.array(massiv);
        assertEquals(massiv[0].doubleValue(), 1.);
        assertEquals(massiv[1].doubleValue(), 2.);
        assertEquals(massiv[2].doubleValue(), 3.);
        assertEquals(massiv[3].doubleValue(), Double.NaN);
    }
}