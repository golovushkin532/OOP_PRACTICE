package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_4;

public class Exception4_2 {
    public static char[] exceptions(String[] strings, int index) {
        char[] charArray = new char[strings.length];
        for (int i = 0; i < strings.length; i++) {
            charArray[i] = strings[i].charAt(index);
        }
        return charArray;
    }
}
