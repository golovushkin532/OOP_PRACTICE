package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_12;

public class String3_12 {
    static String strings(String str, String str2, String str3) {
        for (int i = 0; i < 100 && str.contains(str2); i++) {
            str = str.replaceAll(str2, str3);
        }
        return str;
    }
}
