package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_19;

import java.util.Arrays;

public class String3_19 {
    static String[] strings(String str) {
        String[] arrayStr = str.split(" ");
        return Arrays.stream(arrayStr)
                .filter(s -> !s.isEmpty())
                .map(s -> s.replace(
                        String.valueOf(s.charAt(0)),
                        String.valueOf(s.charAt(0)).toUpperCase()
                ))
                .toArray(String[]::new);
    }
}
