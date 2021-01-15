package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Tasl2_35;

import java.util.Collection;
import java.util.LinkedList;

public class Array2_35 {
    static Collection<String> arrayHex(int[] someArray) {
        Collection<String> hexStrings = new LinkedList<>();
        java.util.Arrays.stream(someArray).forEach(value -> hexStrings.add(Integer.toHexString(value)));
        return hexStrings;
    }
}
