package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_13;

public class String3_13 {
    static String strings(String str, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > str.length()) {
            to = str.length();
        }
        if (from == to) {
            return "";
        }
        return str.substring(from, to);
    }
}
