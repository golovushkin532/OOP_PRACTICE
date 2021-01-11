package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_11;

public class String3_11 {
    static int strings(String[] array, String prefix, String postfix) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}
