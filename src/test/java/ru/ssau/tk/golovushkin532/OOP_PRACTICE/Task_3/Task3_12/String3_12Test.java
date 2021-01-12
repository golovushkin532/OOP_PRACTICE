package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_12;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_12Test {

    @Test
    public void testStrings() {
        assertEquals(new String3_12().strings("opopopopo", "opo", "po"), "popppo");
    }
}