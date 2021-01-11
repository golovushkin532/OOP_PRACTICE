package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_8;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_8Test {

    @Test
    public void testStrings() {
        assertEquals(String3_8.strings("pappahappa", "jo"), -1);
        assertEquals(String3_8.strings("pappahappa", "ha"), 5);
    }
}