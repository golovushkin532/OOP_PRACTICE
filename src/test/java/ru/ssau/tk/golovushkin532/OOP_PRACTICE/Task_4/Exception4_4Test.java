package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exception4_4Test {

    @Test
    public void testExceptions() {
        assertEquals(Exception4_4.exceptions("36", "6"), 6);

        assertThrows(NumberFormatException.class, () -> Exception4_4.exceptions("22", null));
        assertThrows(NumberFormatException.class, () -> Exception4_4.exceptions("33", ""));
        assertThrows(NumberFormatException.class, () -> Exception4_4.exceptions("track", "5"));
    }
}