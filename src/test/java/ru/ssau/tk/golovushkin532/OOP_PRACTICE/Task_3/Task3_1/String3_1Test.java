package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_1Test {

    @Test
    public void testStrings() {
        String str = new String("protect ya neck");
        new String3_1().strings(str);
    }
}