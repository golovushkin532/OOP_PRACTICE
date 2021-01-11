package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_5Test {

    @Test
    public void testStrings() {
        String str = "ХаЮ хАй";
        String str2 = "хаю хай";
        assertTrue(String3_5.strings(str, str2));
        assertFalse(String3_5.strings(str, str));
        assertFalse(String3_5.strings(null, str2));
        assertFalse(String3_5.strings(str, null));
        assertFalse(String3_5.strings(null, null));
    }
}