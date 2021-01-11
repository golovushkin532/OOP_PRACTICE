package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_7;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_7Test {

    @Test
    public void testStrings() {
        assertEquals(String3_7.strings("abcabcabc","ca"),2);
        assertEquals(String3_7.strings("jojo","seer"),-1);
    }
}