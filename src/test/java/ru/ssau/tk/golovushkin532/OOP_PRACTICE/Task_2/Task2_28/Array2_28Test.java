package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_28;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2_28Test {

    @Test
    public void testArrayOne() {
        assertEquals(Array2_28.arrayOne((long) 12.3), new int[]{0, 12});
        assertEquals(Array2_28.arrayTwo(Array2_28.arrayOne((long) 33.2)), (long)33.1);
    }

    @Test
    public void testArrayTwo() {
        assertEquals(Array2_28.arrayTwo(new int[]{0, 110}), 110);
        assertEquals(Array2_28.arrayOne(Array2_28.arrayTwo(new int[]{0, 110})), new int[]{0, 110});
    }
}