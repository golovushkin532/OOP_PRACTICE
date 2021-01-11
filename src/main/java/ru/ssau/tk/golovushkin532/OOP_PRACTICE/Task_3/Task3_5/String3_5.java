package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_5;

import java.util.Objects;

public class String3_5 {
    static boolean strings(String str, String str2) {
        return !Objects.equals(null, str) && !Objects.equals(null, str2)
                && !str.equals(str2)
                && str.equalsIgnoreCase(str2);
    }
}
