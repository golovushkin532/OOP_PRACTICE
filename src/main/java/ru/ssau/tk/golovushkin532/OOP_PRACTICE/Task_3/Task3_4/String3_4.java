package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_4;

public class String3_4 {
    static boolean strings(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
