package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_32;

import java.util.Arrays;

public class Array2_32 {
    static void array(Double[] array) {
        for (Double i : array) {
            if (i.isNaN()) {
                return;
            } else {
                Arrays.sort(array);
            }
        }
    }
}
