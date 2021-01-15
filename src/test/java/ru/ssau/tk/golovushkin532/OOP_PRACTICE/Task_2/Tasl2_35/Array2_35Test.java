package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Tasl2_35;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.Collection;

public class Array2_35Test {

    @Test
    public void testArrayHex() {
        int[] array = new int[]{4, 8, 15, 16, 23, 42};
        Collection<String> hexStrings = Array2_35.arrayHex(array);
        for (String hexString : hexStrings) {
            System.out.println(hexString);
        }
    }
}