package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_20;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_20Test {

    @Test
    public void testStrings() {
        String[] str = {"JUST", "DO", "IT"};
        assertEquals(String3_20.strings(str), "JUST, DO, IT");
    }
}