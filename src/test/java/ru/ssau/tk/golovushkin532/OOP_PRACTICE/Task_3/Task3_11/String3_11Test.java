package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_11;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_11Test {

    @Test
    public void testStrings() {
        String[] array = new String[]{"JUST", "DO", "IT"};
        assertEquals(String3_11.strings(array, "J", "O"), 0);
        assertEquals(String3_11.strings(array, "I", "T"), 1);
    }
}