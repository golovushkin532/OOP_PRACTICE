package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_13;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_13Test {

    @Test
    public void testStrings() {
        String str = "Umpalumpa";
        int sizeStr = str.length();
        assertEquals(String3_13.strings(str, -3, sizeStr), str);
        assertEquals(String3_13.strings(str, 2, sizeStr), str.substring(2));
        assertEquals(String3_13.strings(str, -2, 8), str.substring(0, 8));
        assertEquals(String3_13.strings(str, 2, 8), str.substring(2, 8));
    }
}