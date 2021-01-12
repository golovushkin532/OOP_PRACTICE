package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_24;

import java.nio.charset.Charset;

public class String3_24 {
    public static void strings(String str, Charset CharSet, Charset charSet2) {
        String str2 = new String(str.getBytes(CharSet), charSet2);
        System.out.println(str2);
    }
}
