package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void testTestToString() {
        assertEquals(new Point(1, 2, 3).toString(), "[1.0,2.0,3.0]");
        assertEquals(new Point(5, 6, 0).toString(), "[5.0,6.0,0.0]");
    }
}