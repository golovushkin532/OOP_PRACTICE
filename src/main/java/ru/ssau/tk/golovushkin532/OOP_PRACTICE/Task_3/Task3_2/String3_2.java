package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_3.Task3_2;

public class String3_2 {
    public void strings(String str) {
        byte[] bytes = str.getBytes();
        for (byte byt : bytes) {
            System.out.println(byt);
        }
    }
}
