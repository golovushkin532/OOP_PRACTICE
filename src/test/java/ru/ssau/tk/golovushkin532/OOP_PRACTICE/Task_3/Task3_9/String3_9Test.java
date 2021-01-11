package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_9;

import org.testng.annotations.Test;
import ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_8.String3_8;

import static org.testng.Assert.*;

public class String3_9Test {

    @Test
    public void testStrings() {
        assertEquals(String3_9.strings("wolf", "lf"), 2);
        assertEquals(String3_9.strings("jeans", "ns"), -1);
    }
}