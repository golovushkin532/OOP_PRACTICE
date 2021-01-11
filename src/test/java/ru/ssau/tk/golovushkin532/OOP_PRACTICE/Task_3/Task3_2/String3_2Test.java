package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_2Test {

    @Test
    public void testStrings() {
        String str = "cream";
        new String3_2().strings(str);
        System.out.println("\n");
        String str2 = "кекс";
        new String3_2().strings(str2);
    }
}