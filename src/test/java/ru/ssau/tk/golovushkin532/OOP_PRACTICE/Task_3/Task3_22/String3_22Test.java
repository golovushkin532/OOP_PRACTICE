package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_22;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_22Test {

    @Test
    public void testStrings() {
        assertEquals(String3_22.strings(4), "0123");
        System.out.println(String3_22.strings(10000));
    }
}