package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_10;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_10Test {

    @Test
    public void testStrings() {
        String[] array = new String[]{"JUST", "DO", "IT"};
        assertEquals(String3_10.strings(array, "D", "O"), 1);
        assertEquals(String3_10.strings(array, "J", "U"), 0);
    }
}