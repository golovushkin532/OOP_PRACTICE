package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_10;

public class String3_10 {
    static int strings(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}
