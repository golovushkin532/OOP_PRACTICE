package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_24;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

public class String3_24Test {

    @Test
    public void testStrings() {
        String str = "WEST";
        String3_24.strings(str, StandardCharsets.UTF_8, StandardCharsets.UTF_16BE);
        String3_24.strings(str, StandardCharsets.UTF_16BE, StandardCharsets.UTF_8);
    }
}