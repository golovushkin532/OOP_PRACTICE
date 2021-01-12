package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_19;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_19Test {

    @Test
    public void testStrings() {
        String str = "Я на седьмом этаже это как шестой, но на один повыше";
        String[] arrayStr = String3_19.strings(str);
        for (String string : arrayStr) {
            System.out.println(string);
        }
    }
}