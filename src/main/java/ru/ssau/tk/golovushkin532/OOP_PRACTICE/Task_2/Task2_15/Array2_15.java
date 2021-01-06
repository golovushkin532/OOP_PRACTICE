package ru.ssau.tk.golovushkin532.OOP_PRACTICE.Task_2.Task2_15;

public class Array2_15 {
    static boolean array(int[] massiv, int count) {
        for (int i : massiv) {
            if (i == count) {
                return true;
            }
        }
        return false;
    }
}
