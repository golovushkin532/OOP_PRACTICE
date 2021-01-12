package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_22;

public class String3_22 {
    static String strings(int count) {
        StringBuilder strOfNumber = new StringBuilder();
        for (int i = 0; i < count; i++) {
            strOfNumber.append(i);
        }
        return strOfNumber.toString();
    }
}
