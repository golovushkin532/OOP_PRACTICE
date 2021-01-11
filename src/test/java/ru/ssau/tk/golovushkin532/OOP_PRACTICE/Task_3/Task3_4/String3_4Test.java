package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_4Test {

    @Test
    public void testStrings() {
        assertTrue(String3_4.strings("АННА"));
        assertFalse(String3_4.strings("АЛЕКСАНДР"));
        assertFalse(String3_4.strings("БОБИК"));
    }
}